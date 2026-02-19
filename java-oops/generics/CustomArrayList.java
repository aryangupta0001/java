import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    private boolean isFull(int size) {
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length  * 2];

        for(int i = 0; i<data.length; i++)
            temp[i] = data[i];

        data = temp;
    }

    public void add(int num) {
        if (isFull(size))
            resize();

        data[size++] = num;
    }

    public int remove(){
        if(size>0)
            return data[--size];
        return Integer.MIN_VALUE;
    }

    public String toString(){
        return "CustomArrayList { data = " + Arrays.toString(data) + ", size = " + size + "}";
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);

        System.out.println(list.remove());

        for(int i = 1; i<20; i++)
            list.add(i+10);

        System.out.println(list);

        ArrayList lst = new ArrayList();

        lst.add(1);
        lst.add("Hello");
        lst.add(0.25f);

        System.out.println(lst.toString());
    }
}