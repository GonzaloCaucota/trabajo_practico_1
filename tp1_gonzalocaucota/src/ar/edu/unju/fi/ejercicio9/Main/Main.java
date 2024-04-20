package ar.edu.unju.fi.ejercicio9.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un array para almacenar los productos
        Producto[] productos = new Producto[3];
        
        // Solicitar al usuario que ingrese los datos para cada producto
        for (int i = 0; i < productos.length; i++) {
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto " + (i+1) + ":");
            producto.setNombre(scanner.nextLine());
            System.out.println("Ingrese el código del producto " + (i+1) + ":");
            producto.setCodigo(scanner.nextLine());
            System.out.println("Ingrese el precio del producto " + (i+1) + ":");
            producto.setPrecio(Double.parseDouble(scanner.nextLine()));
            System.out.println("Ingrese el descuento del producto " + (i+1) + " (entre 0 y 50):");
            producto.setDescuento(Integer.parseInt(scanner.nextLine()));
            productos[i] = producto;
        }
        
        // Mostrar los datos de cada producto y el resultado del descuento
        for (int i = 0; i < productos.length; i++) {
            Producto producto = productos[i];
            System.out.println("\nDatos del producto " + (i+1) + ":");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: $" + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento() + "%");
            System.out.println("Precio con descuento: $" + producto.calcularDescuento());
        }
        
        scanner.close();
    }
}