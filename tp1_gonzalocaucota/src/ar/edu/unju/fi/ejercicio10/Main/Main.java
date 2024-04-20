package ar.edu.unju.fi.ejercicio10.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array para almacenar las pizzas
        Pizza[] pizzas = new Pizza[3];

        // Solicitar al usuario que ingrese los datos para cada pizza
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = new Pizza();
            System.out.println("** Pizza " + (i + 1) + " **");
            System.out.println("Ingrese el diámetro de la pizza (20, 30 o 40):");
            pizza.setDiametro(Integer.parseInt(scanner.nextLine()));
            System.out.println("¿La pizza lleva ingredientes especiales? (true/false):");
            pizza.setIngredientesEspeciales(Boolean.parseBoolean(scanner.nextLine()));

            // Calcular el precio y el área de la pizza
            pizza.calcularPrecio();
            pizza.calcularArea();

            pizzas[i] = pizza;
        }

        // Mostrar los datos de cada pizza
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            System.out.println("\n** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizza.getArea());
        }

        scanner.close();
    }
}