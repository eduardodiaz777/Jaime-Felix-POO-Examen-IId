package miPrincipal;

// Producto.java
// Clase para implementar un objeto Producto y su precio

public class Producto {
    private String descripcion;
    private double pesoKilo;
    private double precioKilo;

    // Constructor
    public Producto(String descripcion, double pesoKilo, double precioKilo) {
        // Mandar llamar a los metodos set de los atributos
    }

    // Metodos set/get
    public void setDescripcion(String descripcion) {
        // La descripción no se valida
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

    // Metodo para calcular el precio total del producto
    public double calcularPrecioProducto() {
        return 0.0;
    }

    // Sobrescribir el metodo toString para mostrar la informacion del producto
    @Override
    public String toString() {
        String resultado = String.format("Producto: %s, Peso: %.2f kg, Precio por kilo: $%,.2f",
                descripcion, pesoKilo, precioKilo);
        return resultado;
    }
}
