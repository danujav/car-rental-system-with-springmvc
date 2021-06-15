package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.CarDTO;
import lk.easycarrental.spring.entity.Car;
import lk.easycarrental.spring.exception.ValidateException;
import lk.easycarrental.spring.repo.CarRepo;
import lk.easycarrental.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : Danuja 6/15/21 3:44 PM
 * @version 1.0
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCar(CarDTO dto) {
        if (carRepo.existsById(dto.getRegNumber())) {
            throw new ValidateException("Car Already Exists!");
        }
        carRepo.save(mapper.map(dto, Car.class));
    }

    @Override
    public void deleteCar(String regId) {
        if (!carRepo.existsById(regId)) {
            throw new ValidateException("No Car for Delete!");
        }
        carRepo.deleteById(regId);
    }

    @Override
    public CarDTO searchCar(String regId) {
        Optional<Car> car = carRepo.findById(regId);
        if (car.isPresent()) {
            return mapper.map(car.get(), CarDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = carRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }

    @Override
    public void updateCar(CarDTO dto) {
        if (carRepo.existsById(dto.getRegNumber())) {
            carRepo.save(mapper.map(dto, Car.class));
        }
    }
}
