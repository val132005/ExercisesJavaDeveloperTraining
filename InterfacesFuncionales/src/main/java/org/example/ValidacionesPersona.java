package org.example;

import java.time.LocalDate;
import java.util.function.Predicate;

public class ValidacionesPersona {
    public static void main(String[] args) {
        // Validación del nombre
        Predicate<String> validarNombre = nombre -> nombre.matches("[A-Za-zÁ-ÿ]+(?: [A-Za-zÁ-ÿ]+)*");
        System.out.println(validarNombre.test("Valentina Buenhombre")); // Output: true

        // Validación del apellido
        Predicate<String> validarApellido = apellido -> apellido.matches("[A-Za-zÁ-ÿ]{3,}");
        System.out.println(validarApellido.test("Buenhombre")); // Output: true

        // Validación de la fecha de nacimiento (mayor de edad)
        Predicate<LocalDate> validarMayorEdad = fecha -> fecha.isBefore(LocalDate.now().minusYears(18));
        System.out.println(validarMayorEdad.test(LocalDate.of(1990, 1, 1))); // Output: true
    }
}
