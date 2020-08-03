package spring.boot.work.exception;


import spring.boot.work.utils.ErrorStatus;

public class ServiceException extends Exception {
    private String msg;
    private int status;

    public ServiceException(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public ServiceException(ErrorStatus status) {
        this.msg = status.getMsg();
        this.status = status.getStatus();
    }
}
