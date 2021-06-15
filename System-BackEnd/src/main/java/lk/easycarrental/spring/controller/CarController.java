package lk.easycarrental.spring.controller;


import lk.easycarrental.spring.dto.CarDTO;
import lk.easycarrental.spring.exception.NotFoundException;
import lk.easycarrental.spring.service.CarService;
import lk.easycarrental.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 1:28 AM
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    @Autowired
    private CarService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCar(@RequestBody CarDTO dto) {
        if (dto.getRegNumber().trim().length() <= 0 ) {
            throw new NotFoundException("Car Registration number cannot be Empty!");
        }
        service.saveCar(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchCar(@PathVariable String id) {
        CarDTO carDTO = service.searchCar(id);
        return new ResponseEntity(new StandardResponse("200", "Done", carDTO), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCar() {
        ArrayList<CarDTO> allCars = service.getAllCars();
        return new ResponseEntity(new StandardResponse("200", "Done", allCars), HttpStatus.OK);
    }

    @DeleteMapping(params = {"id"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteCar(@RequestParam String id) {
        service.deleteCar(id);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCar(@RequestBody CarDTO dto) {
        if(dto.getRegNumber().trim().length() <= 0 ) {
            throw new NotFoundException("No registration id provided to update");
        }
        service.updateCar(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.OK);
    }
}
