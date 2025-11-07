import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main081 {

    public static void main(String[] args) {
        for (int value : range(10)) {
            System.out.println(value);
        }

        System.out.println(Collections.min(range(10)));
    }

    private static Collection<Integer> range(int max) {
        if (max < 0) {
            throw new IllegalArgumentException();
        }

        return new AbstractCollection<>() {

            @Override
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() {
                    int cur = -1;

                    @Override
                    public boolean hasNext() {
                        return ++cur < max;
                    }

                    @Override
                    public Integer next() {
                        return cur;
                    }
                };
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
}
