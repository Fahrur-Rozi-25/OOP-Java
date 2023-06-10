package Programs.app;

import Programs.data.LoginRequest;
import Programs.util.ValidationRunTime;

public class RunTimeApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null,null);
        ValidationRunTime.validateRunTime(loginRequest);




    }
}
