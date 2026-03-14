package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println( "Producto - Precio" );
        System.out.println( "=================" );
        System.out.println();

        // Solicitar los datos en el siguiente orden:
        // descripcion, peso en kilos y precio por kilo
        System.out.print("Proporcione la descripcion del producto:");
        String descripcion = entrada.nextLine();
        System.out.print("Proporcione el peso en kilos:");
        double peso = entrada.nextDouble();
        
        System.out.print("Proporcione el precio por kilo:");
        double precio = entrada.nextDouble();
        // Crear un objeto Producto con los datos ingresados
        Producto producto = new Producto(descripcion, peso, precio);
        // Linea en blanco
        System.out.println();

        // Mostrar los datos del producto
        System.out.println(producto);
        // Mostrar el precio del producto
        System.out.printf("Precio del producto: $%,.2f\n",
        producto.calcularPrecioProducto());

        entrada.close();
    }
}