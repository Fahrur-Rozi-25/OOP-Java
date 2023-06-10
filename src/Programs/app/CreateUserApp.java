package Programs.app;

import Programs.data.CreateUSerRequest;
import Programs.util.ValidationUtil;

public class CreateUserApp {
    public static void main(String[] args) {

        CreateUSerRequest user = new CreateUSerRequest();
        user.setUserName("Joko");
        user.setPassword("12345");
        ValidationUtil.ValidationReflection(user);


    }
}
