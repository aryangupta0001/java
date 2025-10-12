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

import java.util.function.Function;
import java.util.function.Predicate;

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
  Function is a functional Interface in Java having an abstract method [apply()] which is used to define a method / function that can accept arguments, andreturn the reult when executed.

  apart from the absttract [appply()] method, Function interface has some Concrete Methods too :-

  1. .andThen()
  2. .compose()
  3. .identity()
  
  */


public class stream_api {

    public static void main(String[] args) {
        Function <Integer, Integer> doubleIt = x -> 2*x;
        Function <Integer, String> toString = x -> String.valueOf(x);
        Function <Integer, Double> thrice = x -> x / 3.0;



        System.out.println("5 * 2 = " + doubleIt.apply(3));
        System.out.println("Thrice of 4 : " + thrice.apply(4));
        System.out.println("1234 too String = " + toString.apply(1234));

        System.out.println(doubleIt.andThen(thrice).apply(4));

    }
}