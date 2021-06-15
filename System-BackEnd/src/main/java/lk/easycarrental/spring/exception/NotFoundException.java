package lk.easycarrental.spring.exception;

/**
 * @author : Danuja 6/15/21 3:32 PM
 * @version 1.0
 */
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
}
