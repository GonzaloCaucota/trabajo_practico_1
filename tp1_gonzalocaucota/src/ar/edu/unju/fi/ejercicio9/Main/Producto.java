package ar.edu.unju.fi.ejercicio9.Main;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento;

    // Constructor por defecto
    public Producto() {
        // No es necesario inicializar los atributos en este constructor
    }

    // Métodos accesores (getters y setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        if (descuento >= 0 && descuento <= 50) {
            this.descuento = descuento;
        } else {
            System.out.println("El descuento debe estar comprendido entre 0 y 50.");
        }
    }

    // Método para calcular el precio con descuento
    public double calcularDescuento() {
        double precioConDescuento = precio;
        if (descuento > 0) {
            precioConDescuento = precio * (1 - (double)descuento / 100);
        }
        return precioConDescuento;
    }
}
