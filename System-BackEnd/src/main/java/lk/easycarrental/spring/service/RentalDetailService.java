package lk.easycarrental.spring.service;

import lk.easycarrental.spring.dto.RentalDetailDTO;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:35 PM
 * @version 1.0
 */
public interface RentalDetailService {
    void saveRentalDetail(RentalDetailDTO dto);

    void deleteRentalDetail(String id);

    RentalDetailDTO searchRentalDetail(String id);

    ArrayList<RentalDetailDTO> getAllRentalDetail();

    void updateRentalDetail(RentalDetailDTO dto);
}
