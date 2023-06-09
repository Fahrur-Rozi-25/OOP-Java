package Programs.util;

public class Math {
    public static int sum(int... value){
        int total = 0;
        for (var values : value){
            total += values;
        };
        return total;
    };
}
