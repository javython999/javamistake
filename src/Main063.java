public class Main063 {

    public static void main(String[] args) {
        User u1 = new User("Kim", 30);
        User u2 = new User("Kim", 20);
        User u3 = new User("Park", 30);

        System.out.println(u1.compareTo(u2));
        System.out.println(u1.compareTo(u3));
    }

    record User(String name, int age) implements Comparable<User> {
        @Override
        public int compareTo(User o) {
            int res = name.compareTo(o.name);
            return res != 0 ? res : Integer.compare(age, o.age);
        }
    }
}
