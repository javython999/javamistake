import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main047 {

    public static void main(String[] args) {
        printFormattedNumber();

        parseFormattedNumber();

        numberFormat();
    }

    private static void printFormattedNumber() {
        double d = 1.234;
        System.out.println(String.format(Locale.KOREA, "%.2f", d));
        System.out.println(String.format(Locale.GERMAN, "%.2f", d));
    }

    private static void parseFormattedNumber() {
        double d = 1.234;


        String koreanFormat = String.format(Locale.KOREA, "%.2f", d);
        double parseKoreanFormat = Double.parseDouble(koreanFormat);

        try {
            String germanFormat = String.format(Locale.GERMAN, "%.2f", d);
            double parseGermanFormat = Double.parseDouble(germanFormat);
        } catch (NumberFormatException e) {
            System.out.println("구분자 때문에 Double.parseDouble 불가능 => " + String.format(Locale.GERMAN, "%.2f", d));
        }
    }

    private static void numberFormat() {
        try {
            Locale locale = Locale.GERMAN;
            NumberFormat format = NumberFormat.getInstance(locale);
            double input = 12345.67;
            String str = format.format(input);
            double output = format.parse(str).doubleValue();
            System.out.println(output);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
