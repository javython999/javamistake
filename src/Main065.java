import java.util.Arrays;
import java.util.Random;

public class Main065 {

    public static void main(String[] args) {
        IntObj x = new IntObj(2_000_000_000);
        IntObj y = new IntObj(0);
        IntObj z = new IntObj(-2_000_000_000);

        System.out.println(x.compareTo(y) > 0);
        System.out.println(y.compareTo(z) > 0);
        System.out.println(x.compareTo(z) > 0);


        Random rand = new Random(209);
        IntObj[] objects = new IntObj[32];
        Arrays.setAll(objects, i -> new IntObj(rand.nextInt()));
        Arrays.sort(objects);

    }


    private static class IntObj implements Comparable<IntObj> {
        final int i;

        IntObj(int i) {
            this.i = i;
        }

        @Override
        public int compareTo(IntObj o) {
            return i - o.i;
        }
    }
}
