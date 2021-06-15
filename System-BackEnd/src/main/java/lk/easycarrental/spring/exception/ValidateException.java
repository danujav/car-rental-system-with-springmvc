package lk.easycarrental.spring.exception;

/**
 * @author : Danuja 6/15/21 3:33 PM
 * @version 1.0
 */
public class ValidateException extends RuntimeException{
    public ValidateException(String message) {
        super(message);
    }
}
