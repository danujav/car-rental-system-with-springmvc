package lk.easycarrental.spring.controller;

import lk.easycarrental.spring.dto.LoginDTO;
import lk.easycarrental.spring.exception.NotFoundException;
import lk.easycarrental.spring.service.LoginService;
import lk.easycarrental.spring.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 4:34 PM
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveLogin(@RequestBody LoginDTO dto) {
        if (dto.getEmail().trim().length() <= 0 ) {
            throw new NotFoundException("Login user's email cannot be Empty!");
        }
        service.saveLogin(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @GetMapping(path = "/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchLogin(@PathVariable String email) {
        LoginDTO loginDTO = service.searchLogin(email);
        return new ResponseEntity(new StandardResponse("200", "Done", loginDTO), HttpStatus.OK);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllLogins() {
        ArrayList<LoginDTO> allLogins = service.getAllLogins();
        return new ResponseEntity(new StandardResponse("200", "Done", allLogins), HttpStatus.OK);
    }

    @DeleteMapping(params = {"email"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteLogin(@RequestParam String email) {
        service.deleteLogin(email);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateLogin(@RequestBody LoginDTO dto) {
        if(dto.getEmail().trim().length() <= 0 ) {
            throw new NotFoundException("Login user not provided email to update");
        }
        service.updateLogin(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.OK);
    }
}
