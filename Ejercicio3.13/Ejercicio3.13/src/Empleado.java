// Definición de la clase Empleado
public class Empleado {

    // variables de instancia (Atributos)
    // Usamos 'private' para proteger los datos (Encapsulamiento).
    // Nadie fuera de esta clase puede modificarlos directamente, solo a través de los métodos.
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // constructor
    // Es un método especial que se ejecuta automáticamente cuando creamos un nuevo Empleado con 'new'.
    // Su trabajo es inicializar las variables con los valores que le pasemos.
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;       // 'this' se refiere al atributo de la clase actual
        this.apellidoPaterno = apellidoPaterno;

        // Si el salario mensual no es positivo, no establezca su valor.
        // Por defecto en Java, los 'double' arrancan en 0.0, así que si es mayor a 0 lo guardamos.
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // metodos establecer
    // Permiten cambiar el valor de un atributo de forma controlada desde fuera de la clase.

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void establecerSalarioMensual(double salarioMensual) {
        // Aplicamos la misma regla de validación al modificar el salario
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    // metodos obtener
    // Permiten consultar o leer el valor actual de los atributos privados desde fuera de la clase.

    public String obtenerPrimerNombre() {
        return primerNombre; // Devuelve el nombre almacenado
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno; // Devuelve el apellido almacenado
    }

    public double obtenerSalarioMensual() {
        return salarioMensual; // Devuelve el salario mensual almacenado
    }
}
