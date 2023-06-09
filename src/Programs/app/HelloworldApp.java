package Programs.app;

import Programs.data.Helloworld;

public class HelloworldApp {
    public static void main(String[] args) {
        Helloworld english = new Helloworld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String Name) {
                System.out.println("Hello "+Name);

            }
        };


    }
}
