public class Main050 {

    public static void main(String[] args) {
        greetUser("Kim");
        greetUser("$0error");
        greetUser("$1error");
    }

    private static void greetUser(String user) {
        String template = "Hello USER_NAME";
        String greeting = template.replaceAll("USER_NAME", user);
        System.out.println(greeting);
    }
}
