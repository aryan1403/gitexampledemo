import java.util.ArrayList;
import java.util.List;

public class queueex {
    List<Integer> list = new ArrayList<>();

    public boolean offer(int value) {
        return list.add(value);
    }

    public int poll() {
        return list.remove(0);
    }

    public List<Integer> getQueue() {
        return list;
    }

    public static void main(String[] args) {
        queueex q = new queueex();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        q.getQueue().forEach(e -> {
            System.out.println(e);
        });

        System.out.println(q.poll());
    }
}
