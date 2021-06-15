package lk.easycarrental.spring.service;

import lk.easycarrental.spring.dto.DriverDTO;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:35 PM
 * @version 1.0
 */
public interface DriverService {
    void saveDriver(DriverDTO dto);

    void deleteDriver(String email);

    DriverDTO searchDriver(String email);

    ArrayList<DriverDTO> getAllDrivers();

    void updateDriver(DriverDTO dto);
}
