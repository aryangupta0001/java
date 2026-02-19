import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    private boolean isFull(int size) {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++)
            temp[i] = data[i];

        data = temp;
    }

    public void add(T num) {
        if (isFull(size))
            resize();

        data[size++] = num;
    }

    public T remove() {
        return (T) data[--size];
    }

    public T get(int index) {
        return (T) data[index];
    }

    public String toString() {
        return "CustomArrayList { data = " + Arrays.toString(data) + ", size = " + size + "}";
    }

    public static void main(String[] args) {
        CustomGenericArrayList <Integer> list = new CustomGenericArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);

        System.out.println(list.remove());
        System.out.println(list.get(2));

        for (int i = 1; i < 20; i++)
            list.add(i + 10);

        System.out.println(list);

    }
}