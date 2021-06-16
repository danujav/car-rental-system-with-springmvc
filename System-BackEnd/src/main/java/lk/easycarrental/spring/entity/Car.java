package lk.easycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Danuja 6/14/21 11:56 PM
 * @version 1.0
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    @Id
    private String regNumber;
    private Double loose;
    private String brand;
    private String type;
    private int noOfPassenger;
    private String transmissionOnType;
    private String fuelType;
    private double dailyRate;
    private double monthlyRate;
    private String freeMileageForPrice;
    private double extraPriceForKM;
    private String color;
    /*private double LDWCost;*/
    private int carQty;
    /*private String avStatus;*/
    @OneToMany(mappedBy = "regNumber", cascade = CascadeType.ALL)
    private List<Rental_Detail> rental_details = new ArrayList<>();
}
