package ar.edu.unju.fi.ejercicio10.Main;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes
    private static final double ADICIONAL_20 = 500;
    private static final double ADICIONAL_30 = 750;
    private static final double ADICIONAL_40 = 1000;

    // Constructor por defecto
    public Pizza() {
    }

    // Getters y setters
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        switch (diametro) {
            case 20:
                precio = ingredientesEspeciales ? 4500 + ADICIONAL_20 : 4500;
                break;
            case 30:
                precio = ingredientesEspeciales ? 4800 + ADICIONAL_30 : 4800;
                break;
            case 40:
                precio = ingredientesEspeciales ? 5500 + ADICIONAL_40 : 5500;
                break;
            default:
                System.out.println("Diámetro inválido");
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * Math.pow(radio, 2);
    }
}