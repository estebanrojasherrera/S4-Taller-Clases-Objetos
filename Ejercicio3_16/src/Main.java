import javax.swing.JOptionPane; // Importamos JOptionPane para las ventanas de dialogo

/**
 * Clase principal que pide los datos del paciente y muestra su reporte cardiologico.
 */
public class Main {
    public static void main(String[] args) {
        // Pedimos nombre y apellido como texto (String)
        String nombre = JOptionPane.showInputDialog("Ingrese su primer nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        // Pedimos dia, mes y anio y los convertimos de String a entero (int) con Integer.parseInt
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento (1-31):"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento (1-12):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su anio de nacimiento (ej. 2006):"));

        // Creamos el objeto personaA con la informacion capturada
        FrecuenciasCardiacas personaA = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        // Construimos el texto del reporte llamando a los metodos de obtencion y de calculo
        String resultado = " REPORTE DE FRECUENCIA CARDIACA \n" +
                "Paciente: " + personaA.obtenerPrimerNombre() + " " + personaA.obtenerApellido() + "\n" +
                "Fecha de nacimiento: " + personaA.obtenerDiaNacimiento() + "/" +
                personaA.obtenerMesNacimiento() + "/" + personaA.obtenerAnioNacimiento() + "\n" +
                "Edad aproximada: " + personaA.calcularEdad() + " anios\n" +
                "Frecuencia cardiaca maxima: " + personaA.calcularFrecuenciaMaxima() + " pulsos por minuto\n" +
                "Rango de frecuencia esperada: entre " + personaA.calcularFrecuenciaEsperadaMinima() +
                " y " + personaA.calcularFrecuenciaEsperadaMaxima() + " pulsos por minuto.";

        // Mostramos el reporte completo en una ventana emergente
        JOptionPane.showMessageDialog(null, resultado);
    }
}