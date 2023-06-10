package Programs.app;

import Programs.Error.ValidationException;
import Programs.data.LoginRequest;
import Programs.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,null);
        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi Error Dengan Pesan "+e.getMessage());
        } finally {
            System.out.println("Anda Telah Melewati Validation");
        }



    }
}
