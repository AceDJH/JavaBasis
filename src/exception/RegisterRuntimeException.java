package exception;

/**
 * @Author AceDJH
 * @Date 2019/11/18 23:11
 */
public class RegisterRuntimeException extends RuntimeException {
    public RegisterRuntimeException() {
    }

    public RegisterRuntimeException(String message) {
        super(message);
    }
}
