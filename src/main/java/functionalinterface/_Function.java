package functionalinterface;

import java.util.function.Function;

/**
 * Function represents a function that gets one argument
 * and produces a result
 */
public class _Function {

    public static void main(String[] args) {
        //Function takes one argument and produces one result
       int increment = incrementByOne(0);
       System.out.println(increment);


       int increment2 = incrementByOneFunction.apply(1);
       System.out.println(increment2);

       int multiply = multiplyBy10.apply(increment2);
       System.out.println(multiply);

        Function<Integer,Integer> addByOneAndThenMultiplyBy10
                =   incrementByOneFunction.andThen(multiplyBy10);

        System.out.println(addByOneAndThenMultiplyBy10.apply(1));
    }
    static Function<Integer,Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer,Integer> multiplyBy10 = number -> number*10;

    static int incrementByOne(int number){
        return number + 1;
    }
}
