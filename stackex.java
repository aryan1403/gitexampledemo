import java.util.ArrayList;
import java.util.List;

public class stackex {
    List<Integer> list = new ArrayList<Integer>();

    // It will add the element to the stack
    public int push(int value) {
        list.add(value);
        return value;
    }

    // It will remove the top most element
    public int pop() {
        return list.remove(list.size()-1);
    }

    // Peeks the top most element
    public int peek() {
        return list.get(list.size()-1);
    }

    public List<Integer> getStack() {
        return list;
    }
    public static void main(String[] args) {
        stackex s = new stackex();
        s.push(5);
        s.push(10);

        s.getStack().forEach(e -> {
            System.out.println(e);
        });
        System.out.println(s.pop());
    }
}