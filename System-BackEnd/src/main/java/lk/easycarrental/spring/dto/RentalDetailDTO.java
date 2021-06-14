package lk.easycarrental.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Danuja 6/15/21 1:45 AM
 * @version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RentalDetailDTO {
    private String rentId;
    private String rentDate;
    private String rentTime;
}
