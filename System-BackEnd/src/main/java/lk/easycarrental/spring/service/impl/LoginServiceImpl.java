package lk.easycarrental.spring.service.impl;

import lk.easycarrental.spring.dto.LoginDTO;
import lk.easycarrental.spring.entity.Login;
import lk.easycarrental.spring.exception.ValidateException;
import lk.easycarrental.spring.repo.LoginRepo;
import lk.easycarrental.spring.service.LoginService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : Danuja 6/15/21 3:45 PM
 * @version 1.0
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveLogin(LoginDTO dto) {
        if (loginRepo.existsById(dto.getEmail())) {
            throw new ValidateException("Login Already Exists!");
        }
        loginRepo.save(mapper.map(dto, Login.class));
    }

    @Override
    public void deleteLogin(String email) {
       if ( !loginRepo.existsById(email)) {
            throw new ValidateException("No Login email for Delete!");
        }
        loginRepo.deleteById(email);
    }

    @Override
    public LoginDTO searchLogin(String email) {
        Optional<Login> login = loginRepo.findById(email);
        if (login.isPresent()) {
            return mapper.map(login.get(), LoginDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<LoginDTO> getAllLogins() {
        List<Login> all = loginRepo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<LoginDTO>>(){}.getType());
    }

    @Override
    public void updateLogin(LoginDTO dto) {
        if (loginRepo.existsById(dto.getEmail())) {
            loginRepo.save(mapper.map(dto, Login.class));
        }
    }
}
