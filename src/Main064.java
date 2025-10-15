public class Main064 {

    public static void main(String[] args) {
        BoolObj b1 = new BoolObj(true);
        BoolObj b2 = new BoolObj(false);

        System.out.println(b1.compareTo(b2)); // 1
        System.out.println(b2.compareTo(b1)); // -1

        BoolObj b3 = new BoolObj(true);
        System.out.println(b1.compareTo(b3));
    }

    private static class BoolObj implements Comparable<BoolObj> {
        final boolean b;

        BoolObj(boolean b) {
            this.b = b;
        }

        @Override
        public int compareTo(BoolObj o) {
            return b && !o.b ? 1 : -1;
        }
    }
}
