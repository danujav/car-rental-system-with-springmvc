package lk.easycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Danuja 6/15/21 1:42 AM
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDTO {
    private String driverEmail;
    private String name;
    private int age;
    private String address;
    private int driverContactNumber;
}
