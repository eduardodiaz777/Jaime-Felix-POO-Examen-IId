package miPrincipal;

// Producto.java
// Clase para implementar un objeto Producto y su precio

public class Producto {
    private String descripcion;


//prueba1

    private double pesoKilo;
    private double precioKilo;

    // Constructor
    public Producto(String descripcion, double pesoKilo, double precioKilo) {
        // Mandar llamar a los metodos set de los atributos
        setDescripcion(descripcion);
        setPesoKilo(pesoKilo);
        setPrecioKilo(precioKilo);
    }

    // Metodos set/get
    public void setDescripcion(String descripcion) {
        // La descripción no se valida
        this.descripcion=descripcion;

    }

    public void setPesoKilo(double pesoKilo) {
        // El peso en kilos debe ser mayor o igual a 0
        if(pesoKilo>=0)
            this.pesoKilo=pesoKilo;
    }

    public void setPrecioKilo(double precioKilo) {
        // El precio por kilo debe ser mayor o igual a 0
         if(precioKilo>=0)
            this.precioKilo=precioKilo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPesoKilo() {
        return pesoKilo;
    }

    public double getPrecioKilo() {
        return precioKilo;
    }

    // Metodo para calcular el precio total del producto
    public double calcularPrecioProducto() {
        return pesoKilo*precioKilo;

    }

    // Sobrescribir el metodo toString para mostrar la informacion del producto
    @Override
    public String toString() {
        String resultado = String.format("  Producto: %s, Peso: %.2f kg, Precio por kilo: $%,.2f",
                descripcion, pesoKilo, precioKilo);
        return resultado;
    }
}
