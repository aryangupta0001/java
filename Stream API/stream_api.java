/*
 * 
 * 
 * Functional Interface :-
 * The Interface that has exactly one Abstract Method, it can have any no. of Concrete methods in it.
 * 
 * 
 * Lambda Expression :-
 * Lambda Expression is an anonymous function that has no name, noo return type, no access moodifier. Thet are mainly used to impplement the functional Interfaces by defining the Abstract Method directly.
 * 
 * 
 * For Example, before Lambda Expressions --->
 */

/*
public class stream_api {
   public static void main(String[] args) {
       Thread t1 = new Thread(new task());
   }
}

class task implements Runnable {
   @Override
   public void run() {
       System.out.println("Hello");
   }
}

*/

/*
 * Now to implement same thing, we can do it by using Lambda Expression, eliminatiing the need to create one more class that implements Runnable interface & defines the Abstract method [run].
 * 
 * New way --->
 */

/*
public class stream_api {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });
    }
}
 */

/*
 * Suppose we create our custom Functional Interface --->
 */

import java.lang.reflect.Array;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

@FunctionalInterface
interface Calculate {
    int operate(int a, int b);
}

// Now to use it, we need to define the Abstract method [operate] in a seperate
// class whose object will be create in publlic class to use it.

/*
 * class addittion implements Calculate {
 * 
 * @Override
 * public int operate(int a, int b) {
 * return a + b;
 * }
 * }
 * 
 * 
 */

/*
 * Now, if we need to define operate method in multipple ways, for Addittion,
 * Substraction, Multipliction, Division, etc... we need to create seperate
 * classes of each operation. Functional Overloading won't work, as there is
 * only one method, so no difference in no. of Expressions & type of
 * Expressions.
 */

/*
 * class substraction implements Calculate {
 * 
 * @Override
 * public int operate(int a, int b) {
 * return a - b;
 * }
 * }
 * 
 * class multiply implements Calculate {
 * 
 * @Override
 * public int operate(int a, int b) {
 * return a * b;
 * }
 * }
 * 
 */

/*
 * public class stream_api {
 * public static void main(String[] args) {
 * addittion add = new addittion();
 * System.out.println(add.operate(1, 2));
 * 
 * substraction sub = new substraction();
 * System.out.println(sub.operate(1, 2));
 * 
 * multiply product = new multiply();
 * System.out.println(product.operate(1, 2));
 * 
 * }
 * }
 * 
 */

/*
 * Now if we use Lambda expressions, then there is no need to create multiple
 * classes to define the Abstract method in different ways, directly use Lambda
 * Expression in the public class --->
 */

/*
 * 
 * public class stream_api {
 * public static void main(String[] args) {
 * Calculate add = (a, b) -> a + b;
 * 
 * Calculate substract = (a, b) -> a - b;
 * 
 * Calculate multiply = (a, b) -> a * b;
 * 
 * Calculate divide = (a, b) -> a / b;
 * 
 * System.out.println(add.operate(1, 2));
 * System.out.println(substract.operate(1, 2));
 * System.out.println(multiply.operate(1, 2));
 * System.out.println(divide.operate(1, 2));
 * }
 * }
 * 
 */

/*
 * Predicate --->
 * Predicate is a Functional Interface that has an Abstract Method [test(T t)]
 * which is a boolean return type function, i.e it takes an object of type T &
 * returns a Boolean value. Predicate's test method is mainly used to test a
 * specific condition.
 * 
 * Predicate Interface has some other methods also -
 * 
 * 1. .and(another Predicate)
 * 2. .or(another Predicate)
 * 3. .negate()
 * 
 * These methods can be used to chain together multiple Predicates to test some
 * complex conditions.
 */

/*
 * public class stream_api {
 * 
 * public static void main(String[] args) {
 * Predicate<Integer> isEven = x -> x % 2 == 0;
 * Predicate<String> startsWithA = x -> x.toUpperCase().startsWith("A");
 * Predicate<String> endsWithA = x -> x.toUpperCase().endsWith("A");
 * Predicate<String> containsA = x -> x.toUpperCase().contains("A");
 * 
 * System.out.println("4 is Even No. : " + isEven.test(4));
 * 
 * System.out.println("Aryan starts with A : " + startsWithA.test("Aryan"));
 * System.out.println("Aryan ends with A : " + endsWithA.test("Aryan"));
 * System.out.println("Aryan contains A : " + containsA.test("Aryan"));
 * 
 * // Chaining of Predicates :-
 * 
 * boolean result1 =
 * startsWithA.and(endsWithA).and(containsA).test("Aryan Gupta");
 * System.out.println(result1);
 * 
 * boolean result2 = startsWithA.or(endsWithA).test("Aryan");
 * System.out.println(result2);
 * 
 * }
 * }
 * 
 */

 /*
  * Function Interface :-
  Function is a functional Interface in Java having an abstract method [apply()] which is used to define a method / function that can accept arguments, and return the reult when executed.

  apart from the absttract [appply()] method, Function interface has some Concrete Methods too :-

  1. .andThen()
  2. .compose()
  3. .identity()
  
  */

  /*

public class stream_api {

    public static void main(String[] args) {
        Function <Double, Double> doubleIt = x -> 2*x;
        Function <Integer, String> toString = x -> String.valueOf(x);
        Function <Double, Double> thrice = x -> x / 3.0;



        System.out.println("5 * 2 = " + doubleIt.apply(3.0));
        System.out.println("Thrice of 4 : " + thrice.apply(4.0));
        System.out.println("1234 too String = " + toString.apply(1234));

        System.out.println(doubleIt.andThen(thrice).apply(4.0));


        // .andThen is used to run another function just after the current one.
        // .compose is used to run the second function before the first function, i.e the execution is done in reverse order.

        // Conclusion --->
        // fn1.andThen(fn2) === fn2.compose(fn1)


        var ans1 = doubleIt.andThen(thrice).apply(4.0);

        var ans2 = thrice.andThen(doubleIt).apply(12.0);
        var ans3 = doubleIt.compose(thrice).apply(12.0);

        // ans2 & ans3 are same.

        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}

*/


/*
 * 
 * Producer Interface --->
 * 
 * Producer is a functional interface in Java that has an abstract method [accept()] which takes an argument but does not returns any thing, i.e void.
 * 
 * Other than .accept, there is one concrete method in Producer, .andThen() that is used to execute one Consumer after another one.
 */

 /*

 public class stream_api {
 
    public static void main(String[] args) {
        Consumer <Integer> print = x -> System.out.println(x);
        print.accept(2);

        Consumer <List<Integer>> printAllElements = x -> {
            for(int i : x)
                System.out.println(i);
        };

        List <Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11);
        printAllElements.accept(list);
    }
 }

 */

/*
 * Supplier Interface --->
 * 
 * Supplier is a functional Interface that has an abstract methods [.get()] which takes no arguments, but is used to return some value.
 * Supplier has no concrete method, i.e there is onlyone method ni Supplier interface, get.
 * 
 */

 /*

public class stream_api {

    public static void main(String[] args) {
        Supplier <LocalDate> getDate = () -> LocalDate.now();
        System.out.println(getDate.get());

        Supplier <LocalDateTime> getDateTime = () -> LocalDateTime.now();
        System.out.println(getDateTime.get());
    }
}

*/



/*
 * 
 * Bi-Predicate, Bi-Consumer, Bi-Function
 * These 3 Functional Interfaces take 2 arguments as Inputs.
 */


 /*
public class stream_api {
    public static void main(String[] args) {
        BiPredicate <Integer, Integer> evenSum = (a, b) -> (a+b) % 2 == 0; 
        System.out.println("Sum of 4 & 28 is Even ? " + evenSum.test(4, 28));

        BiConsumer <Integer, Integer> printSum = (a, b) -> System.out.println(a + b);
        printSum.accept(2, 3);

        BiFunction <String, String, Integer> getConcatenatedLength = (a, b) -> (a+b).length();
        System.out.println("Length of Aryan Gupta is : " + getConcatenatedLength.apply("Aryan ", "Gupta"));

        List<String> names = Arrays.asList("Aryan", "Arush", "Arvind");
        names.forEach(x -> System.out.println(x));

        // Method References could also be passed inplace of Lambda Expression.
        names.forEach(System.out::println);


    }
}

*/


public class stream_api {
    public static void main(String[] args) {

        // How to make a Streame :-

        // 1. From collections, using .stream() --->
        List <Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Stream <Integer> s1 = l1.stream();


        // From Arrays --->
        String[] fruits = {"apple", "banana", "grapes"};

        Stream <String> s2 = Arrays.stream(fruits);



        // Directly using Stream.of() --->
        Stream <String> s3 = Stream.of("A", "B", "C");
        Stream <Integer> s4 = Stream.of(1, 2, 3, 4);



        // Creating Infinite Streams --->

        // 1. using .generate() :-

        // .generate() method takes a supplier as argument & creates a stream of the values given by the supplier

        Stream <Integer> s5 =  Stream.generate(() -> 1);                // This will create an infinite stream of 1, we can also use .limit method to limit the no. of elements
        Stream <Integer> s6 =  Stream.generate(() -> 1).limit(30);




        System.out.println(s1.filter(x -> x%2 == 0).count());



    }    
}