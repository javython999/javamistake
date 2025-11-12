import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main085 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(null, 1, 2);
        var comparator = Comparator.<Integer>nullsLast(Comparator.naturalOrder());
        System.out.println(list.stream().collect(Collectors.maxBy(comparator)));
        System.out.println(list.stream().max(comparator));
    }
}
