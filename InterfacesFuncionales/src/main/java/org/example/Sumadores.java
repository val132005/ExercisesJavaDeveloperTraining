package org.example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Sumadores {

    public static void main(String[] args) {

        int valor2 = 15;
        boolean valor2Boolean = false;

        // Function
        Function<Integer, Integer> functionInteger = t -> t + valor2;
        Function<Double, Double> functionDouble = t -> t + valor2;
        Function<Boolean,Boolean> functionBoolean = t -> Boolean.logicalOr(t, valor2Boolean);

        System.out.println();
        System.out.println("Exercises of Functions");
        System.out.println(functionInteger.apply(5));
        System.out.println(functionDouble.apply(5.5));
        System.out.println(functionBoolean.apply(true));


        // BiFunction

        BiFunction<Integer, Integer, Integer> biFunctionInteger = (x, y) -> x+y;
        BiFunction<Double,Double,Double> biFunctionDouble = (x,y) -> x+y;
        BiFunction<Boolean, Boolean, Boolean> biFunctionBoolean = (x,y) -> Boolean.logicalOr(x, y);

        System.out.println();
        System.out.println("Exercises of ByFunctions");
        System.out.println(biFunctionInteger.apply(22, 5));
        System.out.println(biFunctionDouble.apply(234.5, 456.7));
        System.out.println(biFunctionBoolean.apply(false, false));

    }

}
