package lk.easycarrental.spring.service;

import lk.easycarrental.spring.dto.LoginDTO;

import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:35 PM
 * @version 1.0
 */
public interface LoginService {
    void saveLogin(LoginDTO dto);

    void deleteLogin(String email);

    LoginDTO searchLogin(String email);

    ArrayList<LoginDTO> getAllLogins();

    void updateLogin(LoginDTO dto);
}
