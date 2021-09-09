import java.util.Stack;

public class qstack {
    Stack<Integer> stack = new Stack<>();

    public int offer(int value) {
        return stack.push(value);
    }

    public int poll() {
        return stack.remove(0);
    }

    public Stack<Integer> getQueue() {
        return stack;
    }
    public static void main(String[] args) {
        qstack qs = new qstack();
        qs.offer(10);
        qs.offer(20);
        qs.offer(30);

        System.out.println(qs.poll());
    }
}
