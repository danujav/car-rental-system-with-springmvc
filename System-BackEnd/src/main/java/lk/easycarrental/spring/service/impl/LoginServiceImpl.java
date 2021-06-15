package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.LoginDTO;
import lk.easycarrental.spring.service.LoginService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : Danuja 6/15/21 3:45 PM
 * @version 1.0
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Override
    public void saveLogin(LoginDTO dto) {

    }

    @Override
    public void deleteLogin(String email) {

    }

    @Override
    public LoginDTO searchLogin(String email) {
        return null;
    }

    @Override
    public ArrayList<LoginDTO> getAllLogins() {
        return null;
    }

    @Override
    public void updateLogin(LoginDTO dto) {

    }
}
