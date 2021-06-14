package lk.easycarrental.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Danuja 6/15/21 12:08 AM
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Login {
    @Id
    private String email;
    private String pw;
    private String status;
}
