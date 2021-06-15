package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.LoginDTO;
import lk.easycarrental.spring.dto.RentalDetailDTO;
import lk.easycarrental.spring.entity.Login;
import lk.easycarrental.spring.entity.Rental_Detail;
import lk.easycarrental.spring.exception.ValidateException;
import lk.easycarrental.spring.repo.RentalDetailRepo;
import lk.easycarrental.spring.service.RentalDetailService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : Danuja 6/15/21 3:46 PM
 * @version 1.0
 */
@Service
@Transactional
public class RentalDetailServiceImpl implements RentalDetailService {

    @Autowired
    private RentalDetailRepo rentalDetailRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRentalDetail(RentalDetailDTO dto) {
        if (rentalDetailRepo.existsById(dto.getRentId())) {
            throw new ValidateException("Rental ID Already Exists!");
        }
        rentalDetailRepo.save(mapper.map(dto, Rental_Detail.class));
    }

    @Override
    public void deleteRentalDetail(String id) {
        if ( !rentalDetailRepo.existsById(id)) {
            throw new ValidateException("No id for Delete!");
        }
        rentalDetailRepo.deleteById(id);
    }

    @Override
    public RentalDetailDTO searchRentalDetail(String id) {
        Optional<Rental_Detail> rental_detail = rentalDetailRepo.findById(id);
        if (rental_detail.isPresent()) {
            return mapper.map(rental_detail.get(), RentalDetailDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<RentalDetailDTO> getAllRentalDetail() {
        List<Rental_Detail> all = rentalDetailRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<RentalDetailDTO>>(){}.getType());
    }

    @Override
    public void updateRentalDetail(RentalDetailDTO dto) {
        if (rentalDetailRepo.existsById(dto.getRentId())) {
            rentalDetailRepo.save(mapper.map(dto, Rental_Detail.class));
        }
    }
}
