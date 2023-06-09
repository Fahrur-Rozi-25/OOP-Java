package Programs.app;

import Programs.data.InnerClass;

public class innerApp {
    public static void main(String[] args) {

        InnerClass innerClass = new InnerClass();
        innerClass.setName("Fahrur");
        innerClass.getName();

        InnerClass.home home = innerClass.new home();
        home.getHome();

    }
}
