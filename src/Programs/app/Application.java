package Programs.app;

import Programs.data.Constant;
import Programs.data.Country;
import Programs.util.Math;

public class Application {
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    public static void main(String[] args) {
        System.out.println(Application.PROCESSOR);
        System.out.println(Math.sum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);
        Country.City city = new Country.City();
        city.setName("JAWA");
        System.out.println(city.getName());

    }
}


