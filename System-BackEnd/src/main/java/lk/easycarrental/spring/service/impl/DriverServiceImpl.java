package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.DriverDTO;
import lk.easycarrental.spring.entity.Driver;
import lk.easycarrental.spring.exception.ValidateException;
import lk.easycarrental.spring.repo.DriverRepo;
import lk.easycarrental.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : Danuja 6/15/21 3:45 PM
 * @version 1.0
 */
@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        if (driverRepo.existsById(dto.getDriverEmail())) {
            throw new ValidateException("Driver Already Exists!");
        }
        driverRepo.save(mapper.map(dto, Driver.class));
    }

    @Override
    public void deleteDriver(String email) {
        if (!driverRepo.existsById(email)) {
            throw new ValidateException("No Driver for Delete!");
        }
        driverRepo.deleteById(email);
    }

    @Override
    public DriverDTO searchDriver(String email) {
        Optional<Driver> driver = driverRepo.findById(email);
        if (driver.isPresent()) {
            return mapper.map(driver.get(), DriverDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        List<Driver> all = driverRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (driverRepo.existsById(dto.getDriverEmail())) {
            driverRepo.save(mapper.map(dto, Driver.class));
        }
    }
}
