package org.example;

public class TriFunctionExample {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Boolean> numerosIguales = (x, y, z) -> {
            if (x==y || x==z || y==z){
                return true;
            }else {
                return false;
            }
        };

        Boolean algunNumeroIgual = numerosIguales.apply(2, 3, 2);
        System.out.println("¿Alguno de los numeros es igual? " + algunNumeroIgual);

    }
    @FunctionalInterface
    interface TriFunction<X, Y, Z, W> {
        W apply(X x, Y y, Z z);
    }


}
