public class Main006 {

    public static void main(String[] args) {
        //Integer result = mapValue(5);
        Integer result = mapValue2(5);

        System.out.println(result);
    }

    private static Integer mapValue(int input) {
        return input > 20
                ? 2
                : input > 10
                    ? 1
                    : null;
    }

    private static Integer mapValue2(int input) {
        return input <= 10
                ? null
                : input <= 20
                ? 1
                : 2;
    }
}
