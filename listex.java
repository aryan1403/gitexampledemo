public class listex {
    int size = 10;

    int[] arr;
    int[] darr = new int[size*100];

    int index = 0; // index

    public void add(int value) {
        arr = new int[size];
        int counter = 0;
        for (int i : darr) {
            arr[counter] = i;
            counter++;
        }
        arr[index] = value;
        darr[index] = value;

        index++;
        size += size/2 + 1;
    }

    public void remove(int index) {
        int index2 = 0;
        for (int i : arr) {
            if(i != arr[index]) {
                arr[index2] = i;
                index2++;
            }
        }
    }

    public int[] getList() {
        return arr;
    }

    public static void main(String[] args) {
        listex l = new listex(); // Object
        l.add(10); // 0
        l.add(20); // 1
        int[] a = l.getList();
        for (int i : a) {
            if(i != 0) {
                System.out.println(i);
            }
        }
        l.remove(1);
        a = l.getList();
        for (int i : a) {
            if(i != 0) {
                System.out.println(i);
            }
        }
    }

}
