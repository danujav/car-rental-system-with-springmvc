package lk.easycarrental.spring.repo;

import lk.easycarrental.spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Danuja 6/15/21 4:52 PM
 * @version 1.0
 */
public interface CarRepo extends JpaRepository<Car, String> {
}
