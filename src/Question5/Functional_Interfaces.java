package Question5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.DoubleStream;

public class Functional_Interfaces {
    //answer to A)
    static Function<String,String> function = (String::toUpperCase);

    //answer to B)
    // a is monthly rent and b is all the monthly fees
    static BiFunction<Double, double[], Double> biFunction = (a, b) -> a + Arrays.stream(b).sum();

    //answer to c) you would use this comparator in the logic as
    // you compare each item in the list of properties to compare the values of the
    // highest to lowest num of bedrooms
    Function<List<Integer>, List<Integer>> sort = (x)->{
        Comparator<Integer> cmp = Integer::compare;
        x.sort(cmp);
        return x;
    };

    //answer d)
    static BiFunction<String,String,String> nameCombine = (first, last) -> first+" "+last;

    static BiFunction<Double,Double,String> biCombine = (a, b) -> a+"-"+b;
}
