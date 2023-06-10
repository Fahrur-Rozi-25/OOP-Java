package Programs.app;

import Programs.Error.DatabaseError;

import java.util.SplittableRandom;

public class DatabaseApp {
    public static void main(String[] args) {
    connectDatabase(null,null);
        System.out.println("Success");
    }
    public static void connectDatabase(String username, String password){
        if (username == null || password == null){
            throw new DatabaseError("Tidak Bisa Connect Ke database");
        }
    }
}
