import java.util.List;
import java.util.Objects;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class Main086 {

    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d");

        System.out.println(list.hashCode());

        System.out.println(
                list.stream()
                        .mapToInt(Objects::hashCode)
                        .reduce(1, (x, y) -> x * 31 + y)
        );

        System.out.println(
                list.stream()
                        .parallel()
                        .mapToInt(Objects::hashCode)
                        .reduce(1, (x, y) -> x * 31 + y)
        );

        System.out.println(hashCode(list.stream()));

        System.out.println(hashCodeOf(list.stream()));
    }


    private static int hashCode(Stream<?> stream) {
        return stream.mapToInt(Objects::hashCode)
                .reduce(1, (x, y) -> x * 31 + y);
    }

    private static int hashCodeOf(Stream<?> stream) {
        var op = new IntConsumer() {
            int acc = 1;

            public void accept(int value) {
                acc = acc * 31 + value;
            }
        };

        stream.mapToInt(Objects::hashCode)
                .forEachOrdered(op);
        return op.acc;
    }
}
