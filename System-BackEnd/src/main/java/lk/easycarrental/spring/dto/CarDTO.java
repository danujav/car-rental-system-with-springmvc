package lk.easycarrental.spring.dto;

import lk.easycarrental.spring.entity.Rental_Detail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Danuja 6/15/21 1:39 AM
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarDTO {
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
}
