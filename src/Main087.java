import java.util.Calendar;

public class Main087 {

    public static void main(String[] args) {
        Calendar obj = Calendar.getInstance();
        System.out.println(obj.getClass());

        System.out.println(convert(obj).getClass());
    }

    private static Object convert(Object date) {
        Class<?> cls = date.getClass();
        if (cls == java.util.Date.class) {
            return new java.sql.Date(
                    ((java.util.Date) date).getTime());
        }

        if (cls == java.util.Calendar.class) {
            return new java.sql.Date(
                    ((java.util.Calendar) date).getTime().getTime());
        }

        return date;
    }
}
