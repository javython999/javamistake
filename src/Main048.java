public class Main048 {

    public static void main(String[] args) {
        System.out.printf("Length is %d", "123"); // IllegalFormatConversionException
        System.out.printf("Hello, %s"); // MissingFormatArgumentException
    }
}
