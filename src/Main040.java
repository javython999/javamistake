import java.util.HashSet;
import java.util.Set;

public class Main040 {

    public static void main(String[] args) {

        Double d = 0.0;
        System.out.println(d.equals(-0.0));
        System.out.println(d == -0.0);


        Set<Double> set = new HashSet<>();
        set.add(0.3);
        set.add(0.1 + 0.2);
        System.out.println(set);

        System.out.println(Double.NaN == Double.NaN);
        System.out.println(Float.NaN == Float.NaN);
    }
}
