import java.util.*;
import java.util.stream.Stream;

public class Main074 {

    public static void main(String[] args) {
        /*
        Set<List<String>> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add(list);
        list.add("Value");
        System.out.println(set.contains(list));
        */



        Set<StringBuilder> set = new HashSet<>();

        for (int count = 0; count < 40; count++) {
            set.add(firstBucketStringBuilder());
        }

        int[] hashCodes = set.stream()
                .mapToInt(StringBuilder::hashCode)
                .sorted()
                .toArray();

        StringBuilder sb = Stream.generate(StringBuilder::new)
                .filter(b -> Arrays.binarySearch(hashCodes, b.hashCode()) >= 0)
                .findFirst()
                .get();

        set.add(sb);
        System.out.println(set.contains(sb));

        sb.append("b");
        System.out.println(set.contains(sb));
    }

    static StringBuilder firstBucketStringBuilder() {
        while (true) {
            StringBuilder sb = new StringBuilder("a");
            int hc = sb.hashCode();
            if ((((hc ^ (hc >>> 16)) & 0x3F) == 0)) {
                return sb;
            }
        }
    }
}
