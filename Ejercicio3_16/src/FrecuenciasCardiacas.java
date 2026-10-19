/**
 * Ejercicio 3.16 - Calculadora de la frecuencia cardiaca esperada
 * Almacena los datos del paciente y calcula su edad, frecuencia maxima y rango esperado.
 */
public class FrecuenciasCardiacas {
    // Atributos privados para los datos personales y fecha de nacimiento separada
    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    // Constructor que recibe todos los datos de la persona
    public FrecuenciasCardiacas(String primerNombre, String apellido, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    //  Metodos establecer (Setters) y obtener (Getters)

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    //  Metodos de calculo medico segun las formulas de la AHA

    // Calcula la edad aproximada restando el anio de nacimiento al anio actual (2026)
    public int calcularEdad() {
        return 2026 - anioNacimiento;
    }

    // Formula de frecuencia maxima: 220 menos la edad en anios
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // El limite inferior del rango esperado es el 50% (0.50) de la frecuencia maxima
    public double calcularFrecuenciaEsperadaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    // El limite superior del rango esperado es el 85% (0.85) de la frecuencia maxima
    public double calcularFrecuenciaEsperadaMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}
