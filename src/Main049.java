import java.util.Arrays;

public class Main049 {

    public static void main(String[] args) {
        String javaPackage = "java.util.concurrent";
        String[] parts = javaPackage.split(".");

        System.out.println(Arrays.deepToString(parts));
    }
}
