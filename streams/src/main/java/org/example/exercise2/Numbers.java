package org.example.exercise2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static void reduceMethod(){
        // Creacion de nueva lista de tipo BigInteger (sin restriccion de longitud)
        List<BigInteger> numbers = new ArrayList<>();
        numbers.add(new BigInteger("123456789"));
        numbers.add(new BigInteger("987654321"));
        numbers.add(new BigInteger("456789123"));

        // Se declara una variable que alojara el total de el stream reduce
        BigInteger sum = numbers.stream()
                // ZERO valor inicial para la reduccion
                .reduce(BigInteger.ZERO, BigInteger::add);


        System.out.println("The sum of the numbers are: " + sum);
    }
}
