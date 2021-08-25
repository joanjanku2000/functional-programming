package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {

    public static void main(String[] args) {

        //BiFunction takes 2 arguments and produces one result

        System.out.println( incrementByOneAndMultiply(4,100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncByOne,numberToMultiplyBy) -> (numberToIncByOne + 1)*numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number,int numToMultply){
        return (number + 1) * numToMultply;
    }
}
