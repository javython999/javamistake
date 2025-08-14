import java.util.Random;

public class Main023 {

    public static void main(String[] args) {
        RandomIntEntity randomIntEntity = new RandomIntEntity();
    }


    static class Entity {
        final int id;

        Entity() {
            id = generateId();
        }

        protected int generateId() {
            return 0;
        }
    }

    static class RandomIntEntity extends Entity {
        final Random random = new Random();

        @Override
        protected int generateId() {
            return random.nextInt();
        }
    }
}
