import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Main061 {

    public static void main(String[] args) {
        var h1 = new DataHolder(new int[0], new String[0]);
        var h2 = new DataHolder(new int[0], new String[0]);

        System.out.println(h1.equals(h2));

        var set = new HashSet<>();
        set.add(h1);
        set.add(h2);

        System.out.println(set.size());
        System.out.println(set);
    }

    private static class DataHolder {
        final int[] intData;
        final String[] stringData;

        DataHolder(int[] intData, String[] stringData) {
            this.intData = intData;
            this.stringData = stringData;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataHolder dh = (DataHolder) o;
            return Arrays.equals(intData, dh.intData)
                    && Arrays.equals(stringData, dh.stringData);
        }

        public int hashCode() {
            return Objects.hash(intData, stringData);
        }

        @Override
        public String toString() {
            return "DataHolder{" +
                    "intData=" + Arrays.toString(intData) +
                    ", stringData=" + Arrays.toString(stringData) +
                    '}';
        }
    }
}
