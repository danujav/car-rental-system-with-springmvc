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
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 1:28 AM
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/car")
@CrossOrigin
public class CarController {

    @Autowired
    private CarService service;

    private String carType;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCar(@RequestBody CarDTO dto) {
        carType = dto.getType();

        if (dto.getRegNumber().trim().length() <= 0 ) {
            throw new NotFoundException("Car Registration number cannot be Empty!");
        }
        service.saveCar(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @PostMapping(path = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCarPhoto(@RequestPart("car-pic") MultipartFile myFile) {
        /*
         * There are three ways we can obtain this value, but in all cases we need to use
         * @RequestPart annotation.
         * 1. Byte Array
         * 2. MultipartFile ( Spring way )
         * 3. Part ( Java EE way )
         */
        //  01.First we need to configure MultipartResolver
        //  02.We need to override  method inorder to set MultipartConfigElement
        //  Check WebAppConfig and WebAppInitializer
        //  In spring boot we dont need to add those two configurations

        /*System.out.println(myFile.getOriginalFilename());;*/
        if (carType.equals("General") || carType.equals("general")) {
            try {
                // Let's get the project location
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                // Let's create a folder there for uploading purposes, if not exists
                File uploadsDir = new File(projectPath + "/CarList/General");
                uploadsDir.mkdir();
                // It is time to transfer the file into the newly created dir
                myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
                return true;
            } catch (URISyntaxException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } else if (carType.equals("Premium") || carType.equals("premium")) {
            try {
                // Let's get the project location
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                // Let's create a folder there for uploading purposes, if not exists
                File uploadsDir = new File(projectPath + "/CarList/Premium");
                uploadsDir.mkdir();
                // It is time to transfer the file into the newly created dir
                myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
                return true;
            } catch (URISyntaxException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } else if (carType.equals("Luxury") || carType.equals("luxury")) {
            try {
                // Let's get the project location
                String projectPath = new File(this.getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getParentFile().getAbsolutePath();
                // Let's create a folder there for uploading purposes, if not exists
                File uploadsDir = new File(projectPath + "/CarList/Luxury");
                uploadsDir.mkdir();
                // It is time to transfer the file into the newly created dir
                myFile.transferTo(new File(uploadsDir.getAbsolutePath() + "/" + myFile.getOriginalFilename()));
                return true;
            } catch (URISyntaxException e) {
                e.printStackTrace();
                return false;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } else {
            return false;
        }

    }

    @GetMapping(path = "/{carReg}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchCar(@PathVariable String carReg) {
        CarDTO carDTO = service.searchCar(carReg);
        return new ResponseEntity(new StandardResponse("200", "Done", carDTO), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCar() {
        ArrayList<CarDTO> allCars = service.getAllCars();
        System.out.println("Hey fucker");
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
