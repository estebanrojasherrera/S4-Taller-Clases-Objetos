import java.util.Scanner; // Importamos Scanner para leer datos por consola

/**
 * Clase principal para probar el funcionamiento de la clase Factura.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para capturar lo que escriba el usuario
        Scanner entrada = new Scanner(System.in);

        System.out.println(" SISTEMA DE FACTURACION DE FERRETERIA ");

        // Pedimos al usuario cada dato por consola
        System.out.print("Ingrese el numero de pieza: ");
        String numPieza = entrada.nextLine();

        System.out.print("Ingrese la descripcion de la pieza: ");
        String descPieza = entrada.nextLine();

        System.out.print("Ingrese la cantidad de articulos: ");
        int cant = entrada.nextInt();

        System.out.print("Ingrese el precio por articulo: ");
        double precio = entrada.nextDouble();

        // Instanciamos el objeto facturaA enviando los datos al constructor
        Factura facturaA = new Factura(numPieza, descPieza, cant, precio);

        // Mostramos los datos guardados usando los metodos obtener (getters)
        System.out.println("\n DETALLE DE LA FACTURA ");
        System.out.println("Numero de pieza: " + facturaA.obtenerNumeroPieza());
        System.out.println("Descripcion: " + facturaA.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + facturaA.obtenerCantidad());
        System.out.println("Precio por articulo: $" + facturaA.obtenerPrecioPorArticulo());
        System.out.println("Monto total de la factura: $" + facturaA.obtenerMontoFactura());

        // Cerramos el Scanner
        entrada.close();
    }
}