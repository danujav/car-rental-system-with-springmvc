package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.RentalDetailDTO;
import lk.easycarrental.spring.service.RentalDetailService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:46 PM
 * @version 1.0
 */
@Service
@Transactional
public class RentalDetailServiceImpl implements RentalDetailService {
    @Override
    public void saveRentalDetail(RentalDetailDTO dto) {

    }

    @Override
    public void deleteRentalDetail(String id) {

    }

    @Override
    public RentalDetailDTO searchRentalDetail(String id) {
        return null;
    }

    @Override
    public ArrayList<RentalDetailDTO> getAllRentalDetail() {
        return null;
    }

    @Override
    public void updateRentalDetail(RentalDetailDTO dto) {

    }
}
