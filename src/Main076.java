import java.util.*;

public class Main076 {

    public static void main(String[] args) {
        //case1();
        //case2();
        case3();
    }

    private static void case1() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        for (String s : list) {
            System.out.println(s);
            if ("b".equals(s)) {
                list.add("x");
            }
        }
    }

    private static void case2() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if ("b".equals(list.get(i))) {
                list.add("x");
            }
        }
    }

    private static void case3() {
        List<String> list = new ArrayList<>(List.of("a", "b", "c"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            if ("b".equals(s)) {
                list.remove("a");
            }
        }
    }
}
