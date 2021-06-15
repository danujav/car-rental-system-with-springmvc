package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.CarDTO;
import lk.easycarrental.spring.service.CarService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:44 PM
 * @version 1.0
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {
    @Override
    public void saveCar(CarDTO dto) {

    }

    @Override
    public void deleteCar(String regId) {

    }

    @Override
    public CarDTO searchCar(String regId) {
        return null;
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        return null;
    }

    @Override
    public void updateCar(CarDTO dto) {

    }
}
