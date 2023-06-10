package Programs.app;

import Programs.Error.RunTimeException;

public class StackTraceApp {
    public static void main(String[] args) {
    try {
        SampleError();
    } catch (RuntimeException e){
        e.printStackTrace();
    }
    }
    public static void SampleError () {
        try {
            String[] names = {
                    "Fahrur", "Rozi", "Dea"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
