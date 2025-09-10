import java.net.URL;
import java.net.URLClassLoader;

public class Main043 {

    public static void main(String[] args) throws Exception {

        // 컴파일된 Main043 클래스가 있는 폴더 지정
        URL url = Main043.class.getResource(".");

        // 시스템 클래스를 가져오는 부모 클래스 로더
        ClassLoader parent = System.class.getClassLoader();

        try (URLClassLoader newLoader = new URLClassLoader(new URL[]{url}, parent)) {
            Class<?> anotherMyClass = newLoader.loadClass("Main043");
            Object o = anotherMyClass.getConstructor().newInstance();
            System.out.println("Class: " + o.getClass());
            System.out.println("Loader: " + o.getClass().getClassLoader());
            System.out.println("Instance of: " + (o instanceof Main043));
            Main043 main043 = (Main043) o;
        }
    }
}
