public class Main066 {

    public static void main(String[] args) {
        DoubleObj x = new DoubleObj(Double.NaN);
        DoubleObj y = new DoubleObj(0);

        System.out.println(x.compareTo(y) > 0);
        System.out.println(y.compareTo(x) > 0);
        System.out.println(x.compareTo(x) > 0);
    }

    private static class DoubleObj implements Comparable<DoubleObj> {
        final double d;

        DoubleObj (double d) {
            this.d = d;
        }

        @Override
        public int compareTo(DoubleObj o) {
            return d == o.d ? 0 : d < o.d ? - 1 : 1;
        }
    }
}
