package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.DriverDTO;
import lk.easycarrental.spring.service.DriverService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:45 PM
 * @version 1.0
 */
@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Override
    public void saveDriver(DriverDTO dto) {

    }

    @Override
    public void deleteDriver(String email) {

    }

    @Override
    public DriverDTO searchDriver(String email) {
        return null;
    }

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        return null;
    }

    @Override
    public void updateDriver(DriverDTO dto) {

    }
}
