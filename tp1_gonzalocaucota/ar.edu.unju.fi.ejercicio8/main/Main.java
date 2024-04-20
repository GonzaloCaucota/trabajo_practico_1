package main;

import java.util.Scanner;
import model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el valor de n
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        
        // Crear un objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
        
        // Calcular y mostrar la sumatoria
        double sumatoria = calculadora.calcularSumatoria();
        System.out.println("La sumatoria es: " + sumatoria);
        
        // Calcular y mostrar la productoria
        double productoria = calculadora.calcularProductoria();
        System.out.println("La productoria es: " + productoria);
        
        scanner.close();
    }
}
