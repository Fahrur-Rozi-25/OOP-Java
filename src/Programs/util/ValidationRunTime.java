package Programs.util;

import Programs.Error.ValidationException;
import Programs.data.LoginRequest;

public class ValidationRunTime {
    public static void validateRunTime (LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username Tidak Boleh Null");
        } else if (loginRequest.username().isBlank()) {
            throw new RuntimeException ("Username Tidak Boleh Kosong");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password Tidak Boleh Null");
        } else if (loginRequest.password().isBlank()) {
            throw new RuntimeException("Password Tidak Boleh Kosong");
        }
    }
}
