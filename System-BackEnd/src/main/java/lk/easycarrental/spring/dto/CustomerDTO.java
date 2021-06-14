package lk.easycarrental.spring.dto;

import lk.easycarrental.spring.entity.Rental_Detail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Danuja 6/15/21 1:36 AM
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String custEmail;
    private String custName;
    private String custAddress;
    private int custContactNumber;
    private String custNIC;
    private String custDrivingLicien;
}
