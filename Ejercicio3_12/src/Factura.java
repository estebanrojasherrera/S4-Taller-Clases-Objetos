/**
 * Ejercicio 3.12 - La clase Factura
 * Representa la factura de un articulo vendido en una ferreteria.
 */
public class Factura {
    // Variables de instancia privadas (encapsulamiento) segun el diagrama UML
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor que recibe los 4 parametros para inicializar el objeto
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;

        // Validamos que la cantidad sea positiva; si no, se guarda en 0
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

        // Validamos que el precio sea positivo si no, se guarda en 0.0
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    //  Metodos establecer (Setters) y obtener (Getters)

    // Asigna el codigo o numero de la pieza
    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    // Devuelve el numero de la pieza
    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    // Asigna la descripcion de la pieza
    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    // Devuelve la descripcion de la pieza
    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    // Asigna la cantidad validando que no sea un numero negativo
    public void establecerCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    // Devuelve la cantidad de articulos
    public int obtenerCantidad() {
        return cantidad;
    }

    // Asigna el precio por articulo validando que sea mayor a 0.0
    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0.0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    // Devuelve el precio unitario del articulo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    //  Metodo de calculo

    // Calcula y devuelve el total multiplicando la cantidad por el precio unitario
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}
