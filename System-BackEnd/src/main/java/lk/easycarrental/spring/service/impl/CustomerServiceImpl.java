package lk.easycarrental.spring.service.impl;


import lk.easycarrental.spring.dto.CustomerDTO;
import lk.easycarrental.spring.entity.Customer;
import lk.easycarrental.spring.exception.ValidateException;
import lk.easycarrental.spring.repo.CustomerRepo;
import lk.easycarrental.spring.service.CustomerService;
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
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getCustEmail())) {
            throw new ValidateException("Customer Already Exists!");
        }
        customerRepo.save(mapper.map(dto, Customer.class));
    }

    @Override
    public void deleteCustomer(String email) {
        if (!customerRepo.existsById(email)) {
            throw new ValidateException("No Customer for Delete!");
        }
        customerRepo.deleteById(email);
    }

    @Override
    public CustomerDTO searchCustomer(String email) {
        Optional<Customer> customer = customerRepo.findById(email);
        if (customer.isPresent()) {
            return mapper.map(customer.get(), CustomerDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> all = customerRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CustomerDTO>>(){}.getType());
    }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if (customerRepo.existsById(dto.getCustEmail())) {
            customerRepo.save(mapper.map(dto, Customer.class));
        }
    }
}
