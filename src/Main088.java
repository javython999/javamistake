@MyAnno
public class Main088 {

    public static void main(String[] args) {
        MyAnno annotation = Main088.class.getAnnotation(MyAnno.class);
        System.out.println(annotation.getClass());
    }
}
