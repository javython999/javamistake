public class Main067 {

    public static void main(String[] args) {
        var u1 = new User(null);
        var u2 = new User("Mary");
        var u3 = new User("Bill");

        System.out.println(u1.compareTo(u2));
        System.out.println(u2.compareTo(u3));
        System.out.println(u1.compareTo(u3));
    }

    record User(String name) implements Comparable<User> {
        public int compareTo(User o) {
            if (name != null && o.name != null) {
                return name.compareTo(o.name);
            }

            return 0;
        }
    }
}


