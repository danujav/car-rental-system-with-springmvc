package lk.easycarrental.spring.repo;

import lk.easycarrental.spring.entity.Rental_Detail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Danuja 6/15/21 4:56 PM
 * @version 1.0
 */
public interface RentalDetailRepo extends JpaRepository<Rental_Detail, String> {
}
