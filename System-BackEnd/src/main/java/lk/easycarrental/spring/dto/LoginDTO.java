package lk.easycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Danuja 6/15/21 1:43 AM
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginDTO {
    private String email;
    private String pw;
    private String status;
}
