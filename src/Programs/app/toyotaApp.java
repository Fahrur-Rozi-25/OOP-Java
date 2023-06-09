package Programs.app;

import Programs.crucials.TOYOTA;
import Programs.data.CarsData;

public class toyotaApp {
    public static void main(String[] args) {
        CarsData toyota = new TOYOTA();
        toyota.Name();
        Object Name = toyota.Name();
        System.out.println(Name);
    }

}
