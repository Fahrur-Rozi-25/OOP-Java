package Programs.app;

import Programs.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest req = new LoginRequest("Fahrur","12345");

        System.out.println(req.password());
        System.out.println(req.username());
        System.out.println(new LoginRequest("Rizal"));


    }
}
