package success;

import org.springframework.http.HttpStatus;

public interface SuccessCase {
    HttpStatus getHttpStatus();
    String getMessage();
}
