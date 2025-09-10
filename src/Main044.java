import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class Main044 {

    public static void main(String[] args) {
        Node root = new Node("root", new Node("child1", new Node("grandchild")), new Node("child2"));
        System.out.println(root.find("grandchild"));
    }

    record Node(String name, Node ...children) {
//        Node find(String name) {
//            if (name().equals(name)) return this;
//            for (Node child: children()) {
//                Node node = child.find(name);
//                if (node != null) return node;
//            }
//            return null;
//        }

        Node find(String name) {
            Deque<Node> stack = new ArrayDeque<>();
            stack.add(this);
            while (!stack.isEmpty()) {
                Node node = stack.pollLast();
                if (node.name().equals(name)) return node;
                Collections.addAll(stack, node.children());
            }
            return null;
        }
    }
}
