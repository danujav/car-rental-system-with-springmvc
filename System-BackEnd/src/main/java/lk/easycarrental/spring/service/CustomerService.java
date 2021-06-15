package lk.easycarrental.spring.service;

import lk.easycarrental.spring.dto.CustomerDTO;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:35 PM
 * @version 1.0
 */
public interface CustomerService {
    void saveCustomer(CustomerDTO dto);

    void deleteCustomer(String email);

    CustomerDTO searchCustomer(String email);

    ArrayList<CustomerDTO> getAllCustomers();

    void updateCustomer(CustomerDTO dto);
}
