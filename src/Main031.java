public class Main031 {

    public static void main(String[] args) {
        long longVal = 1L << 53;
        double doubleVal = longVal;
        double doubleValPlusOne = longVal + 1;

        System.out.println(doubleVal == doubleValPlusOne);
    }
}
