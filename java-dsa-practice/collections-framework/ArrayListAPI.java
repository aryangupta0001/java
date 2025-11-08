import java.util.ArrayList;

public class ArrayListAPI {
    public static void main(String[] args){

        ArrayList <Integer> arrayList = new ArrayList<>();

        // To add elements, use .add --->
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(15);
        arrayList.add(1);
        arrayList.add(20);

        // To remove elements, use .remove --->
        // 1. .remove(Object) removes the object
        // 2. .remove(index) removes the element at the specified index.

        arrayList.remove(1);        // does not removes 1, instead it removes element at index 1, i.e 12.
        arrayList.remove(Integer.valueOf(1));       // removes element 1, since Integer.valueOf(1) converts the 1 to Integer object 1.

        // Iterate over ArrayList :-

        // 1. For - Loop --->

        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));               //.get(index) to retrieve element at index specified.
        }

        // 2. foreach loop --->
        System.out.println("Print 2x of elements using foreach :-");
        arrayList.forEach(element -> System.out.println(2*element));


        
    }
}