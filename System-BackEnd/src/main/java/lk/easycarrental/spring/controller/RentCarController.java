package lk.easycarrental.spring.controller;

import lk.easycarrental.spring.dto.RentalDetailDTO;
import lk.easycarrental.spring.exception.NotFoundException;
import lk.easycarrental.spring.service.RentalDetailService;
import lk.easycarrental.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 1:32 AM
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/rent")
public class RentCarController {

    @Autowired
    private RentalDetailService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveRentDetail(@RequestBody RentalDetailDTO dto) {
        if (dto.getRentId().trim().length() <= 0 ) {
            throw new NotFoundException("RentalCarDetail Id cannot be Empty!");
        }
        service.saveRentalDetail(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchRentalDetail(@PathVariable String id) {
        RentalDetailDTO rentalDetailDTO = service.searchRentalDetail(id);
        return new ResponseEntity(new StandardResponse("200", "Done", rentalDetailDTO), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllRentalDetail() {
        ArrayList<RentalDetailDTO> allRentalDetail = service.getAllRentalDetail();
        return new ResponseEntity(new StandardResponse("200", "Done", allRentalDetail), HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteRentalDetail(@RequestParam String id) {
        service.deleteRentalDetail(id);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateRentalDetail(@RequestBody RentalDetailDTO dto) {
        if(dto.getRentId().trim().length() <= 0 ) {
            throw new NotFoundException("No Rental id provided to update");
        }
        service.updateRentalDetail(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.OK);
    }

}
