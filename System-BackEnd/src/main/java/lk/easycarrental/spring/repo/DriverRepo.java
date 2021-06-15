package lk.easycarrental.spring.repo;

import lk.easycarrental.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Danuja 6/15/21 4:54 PM
 * @version 1.0
 */
public interface DriverRepo extends JpaRepository<Driver, String> {
}
