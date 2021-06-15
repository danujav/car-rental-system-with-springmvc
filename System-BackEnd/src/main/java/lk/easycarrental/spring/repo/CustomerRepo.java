package lk.easycarrental.spring.repo;

import lk.easycarrental.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Danuja 6/15/21 4:53 PM
 * @version 1.0
 */
public interface CustomerRepo extends JpaRepository<Customer, String> {
}
