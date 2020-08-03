package spring.boot.work.handler;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import spring.boot.work.exception.DaoException;
import spring.boot.work.exception.ServiceException;
import spring.boot.work.utils.ErrorStatus;
import spring.boot.work.utils.ResponseEntity;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler
    public ResponseEntity handlerException(Exception ex) {
        if (ex instanceof ServiceException) {
            return ResponseEntity.error(ErrorStatus.SERVICE_ERROR);
        } else if (ex instanceof DaoException) {
            return ResponseEntity.error(ErrorStatus.DAO_ERROR);
        }
        return ResponseEntity.error();
    }

}
