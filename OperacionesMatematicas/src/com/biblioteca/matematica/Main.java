package com.biblioteca.matematica;

public class Main {
    public static void main(String[] args) {
        double sumaResultado = OperacionesMatematicas.suma(5.0, 3.0);
        double restaResultado = OperacionesMatematicas.resta(10.0, 4.0);
        double multiplicacionResultado = OperacionesMatematicas.multiplicacion(6.0, 7.0);
        double divisionResultado = OperacionesMatematicas.division(20.0, 5.0);

        System.out.println("Resultado de la suma: " + sumaResultado);
        System.out.println("Resultado de la resta: " + restaResultado);
        System.out.println("Resultado de la multiplicación: " + multiplicacionResultado);
        System.out.println("Resultado de la división: " + divisionResultado);
    }
}
