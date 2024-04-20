package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese los datos
        System.out.println("Ingrese el DNI:");
        String dni = scanner.nextLine();
        
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la fecha de nacimiento (en formato YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        
        String provincia = "jujuy";
        
        // Crear objeto Persona con los datos ingresados
        Model persona = new Model(dni, nombre, fechaNacimiento, provincia);
        
        // Mostrar los datos de la persona
        persona.mostrarDatos();
        
        scanner.close();
    }
}