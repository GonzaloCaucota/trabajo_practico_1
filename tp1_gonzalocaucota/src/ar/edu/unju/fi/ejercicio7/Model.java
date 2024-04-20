package ar.edu.unju.fi.ejercicio7;

public class Model {
    // Atributos
    private String nombre;
    private int legajo;
    private double salario;
    
    // Constantes
    private static final double SALARIO_MINIMO = 210000.00;
    private static final double AUMENTO_POR_MERITOS = 20000.00;
    
    // Constructor
    public Model(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        
        // asignar el salario
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }
    
    // mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + salario);
    }
    
    // aumento al salario del empleado
    public void darAumento() {
        salario += AUMENTO_POR_MERITOS;
    }
}