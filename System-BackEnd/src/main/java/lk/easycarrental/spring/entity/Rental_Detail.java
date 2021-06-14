package lk.easycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author : Danuja 6/15/21 12:10 AM
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Rental_Detail {
    @Id
    private String rentId;
    private String rentDate;
    private String rentTime;
    @ManyToOne
    @JoinColumn(name = "custEmail", referencedColumnName = "custEcmail", insertable = false, updatable = false)
    private Customer custEmail;
    @ManyToOne
    @JoinColumn(name = "regNumber", referencedColumnName = "regNumber", insertable = false, updatable = false)
    private Car regNumber;
    @ManyToOne
    @JoinColumn(name = "driverEmail", referencedColumnName = "driverEmail", insertable = false, updatable = false)
    private Driver driverEmail;
}
