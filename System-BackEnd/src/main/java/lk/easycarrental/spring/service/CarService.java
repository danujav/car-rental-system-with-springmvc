package lk.easycarrental.spring.service;

import lk.easycarrental.spring.dto.CarDTO;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:35 PM
 * @version 1.0
 */
public interface CarService {
    void saveCar(CarDTO dto);

    void deleteCar(String regNo);

    CarDTO searchCar(String regNo);

    ArrayList<CarDTO> getAllCars();

    void updateCar(CarDTO dto);
}
