import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main075 {

    public static void main(String[] args) {
        HashSet<Integer> set = IntStream.range(0, 100)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);


        HashSet<Integer> set2 = IntStream.range(0, 100)
                .mapToObj(x -> x * 10)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(set2); // [0, 1, 2, 3, 4, 5, 6, 7, ...]
    }
}
