package miPrincipal;

// Producto.java
// Clase para implementar un objeto Producto y su precio

public class Producto {
    private String descripcion;
    private double pesoKilo;
    private double precioKilo;

    // Constructor
    public Producto(String descripcion, double pesoKilo, double precioKilo) {
        // Mandar llamar a los métodos set de los atributos
    }

    // Métodos set/get
    public void setDescripcion(String descripcion) {
        // La descripción no se válida
    }

    public void setPesoKilo(double pesoKilo) {
        // El peso en kilos debe ser mayor o igual a 0
    }

    public void setPrecioKilo(double precioKilo) {
        // El precio por kilo debe ser mayor o igual a 0
    }

    public String getDescripcion() {
        return "";
    }

    public double getPesoKilo() {
        return 0.0;
    }

    public double getPrecioKilo() {
        return 0.0;
    }

    // Método para calcular el precio total del producto
    public double calcularPrecioProducto() {
        return 0.0;
    }

    // Sobrescribir el método toString para mostrar la información del producto
    @Override
    public String toString() {
        String resultado = String.format("Producto: %s, Peso: %.2f kg, Precio por kilo: $%,.2f",
                descripcion, pesoKilo, precioKilo);
        return resultado;
    }
}
