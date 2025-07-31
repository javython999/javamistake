public class Main010 {

    public static void main(String[] args) {
        printFormatted("Hello, %s%n");
        printFormatted("Hello, %s%n", "administrator");

        printFormattedMistake("Hello, %s%n");
        printFormattedMistake("Hello, %s%n", "administrator");

        printFormattedSolution("Hello, %s%n");
        printFormattedSolution("Hello, %s%n", "administrator");
    }

    private static void printFormatted(String formatString, Object... params) {
        if (params.length == 0) {
            System.out.printf(formatString, "user");
        } else {
            System.out.printf(formatString, params);
        }
    }

    private static void printFormattedMistake(String formatString, Object... params) {
        System.out.printf(formatString, params.length == 0 ? "user" : params);
    }

    private static void printFormattedSolution(String formatString, Object... params) {
        System.out.printf(formatString, params.length == 0 ? new Object[] {"user"} : params);
    }
}
