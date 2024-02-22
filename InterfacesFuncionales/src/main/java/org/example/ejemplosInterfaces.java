package org.example;

import java.util.function.*;

public class ejemplosInterfaces {
    public static void main(String[] args) {
        // Functions
        Function<String, Integer> longitudCadena = cadena -> cadena.length();
        int longitud = longitudCadena.apply("Yeimi Valentina Buenhombre Sánchez");
        System.out.println("La longitud de la cadena es: "+longitud);

        // Bi function
        BiFunction<String, String, String> concatenarCadenas = (cadena1, cadena2) -> cadena1 + cadena2;
        String resultadoBiFunction = concatenarCadenas.apply("Valentina", "Buenhombre");
        System.out.println("El resultado de unir las cadenas es: "+resultadoBiFunction);

        // Unary operator
        UnaryOperator<Integer> incrementar = num -> num+2;
        int resultadoUnaryOperator = incrementar.apply(5);
        System.out.println("Numero uncrementado en 2: "+resultadoUnaryOperator);

        //Consumer
        Consumer<String> imprimir = mensaje -> System.out.println(mensaje);
        imprimir.accept("Hola, soy Valentina Buenhombre");

        // Supplier
        Supplier<Integer> generarAleatorio = ()->(int)(Math.random()*200);
        int numeroAleartorio= generarAleatorio.get();
        System.out.println(numeroAleartorio);

        // Predicate
        Predicate<Integer> esImpar = numero->numero%2!=0;
        boolean resultadorImpar = esImpar.test(5);
        System.out.println(resultadorImpar);


    }

}
