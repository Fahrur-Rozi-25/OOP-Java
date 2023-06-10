package Programs.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(
                    new FileReader("README.md")
            );

            while (true){
                String line = bufferedReader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable throwable){
            System.out.println("Error membaca file "+throwable.getMessage());

        }finally {
            if (bufferedReader != null){
                try {
                    bufferedReader.close();
                    System.out.println("Success Close");
                } catch (IOException exception){
                    System.out.println("Error Menutup "+exception.getMessage());
                }
            }
        }


    }
}
