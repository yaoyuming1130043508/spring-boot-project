package spring.boot.work.exception;


import spring.boot.work.utils.ErrorStatus;

public class DaoException extends RuntimeException{
    private String msg;
    private int status;
    public DaoException(String msg, int status){
        this.msg=msg;
        this.status=status;
    }
    public DaoException(ErrorStatus errorStatus){
        this.msg=errorStatus.getMsg();
        this.status=errorStatus.getStatus();
    }
}
