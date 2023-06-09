package Programs.crucials;

import Programs.data.CarsData;

public class TOYOTA implements CarsData {
    @Override
    public Object Name() {
        System.out.println("TOYOTA");
        return null;
    }
    public void Brand(String Name){
        System.out.println(Name);

    }
}
