import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // -- DATOS EMPLEADO 1 --
        System.out.println("-DATOS DEL PRIMER EMPLEADO-");
        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = entrada.nextLine();

        System.out.print("Ingrese el apellido paterno: ");
        String apellido1 = entrada.nextLine();

        System.out.print("Ingrese el salario mensual: ");
        // Leemos el salario como texto para evitar que se caiga por los decimales
        String salarioTexto1 = entrada.nextLine();
        // Reemplazamos cualquier coma por un punto y convertimos el texto a double de forma segura
        double salario1 = Double.parseDouble(salarioTexto1.replace(',', '.'));

        // Creamos el primer objeto Empleado
        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);

        System.out.println(); // Línea en blanco

        // -- DATOS EMPLEADO 2 --
        System.out.println(" -DATOS DEL SEGUNDO EMPLEADO-");
        System.out.print("Ingrese el primer nombre: ");
        String nombre2 = entrada.nextLine();

        System.out.print("Ingrese el apellido paterno: ");
        String apellido2 = entrada.nextLine();

        System.out.print("Ingrese el salario mensual: ");
        String salarioTexto2 = entrada.nextLine();
        double salario2 = Double.parseDouble(salarioTexto2.replace(',', '.'));

        // Creamos el segundo objeto Empleado
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        // MOSTRAR SALARIOS ANUALES INICIALES

        System.out.println("\n-------------------------------------------");
        System.out.println("SALARIOS ANUALES INICIALES:");

        double salarioAnual1 = emp1.obtenerSalarioMensual() * 12;
        double salarioAnual2 = emp2.obtenerSalarioMensual() * 12;

        System.out.printf("%s %s: $%.2f al año%n",
                emp1.obtenerPrimerNombre(), emp1.obtenerApellidoPaterno(), salarioAnual1);
        System.out.printf("%s %s: $%.2f al año%n",
                emp2.obtenerPrimerNombre(), emp2.obtenerApellidoPaterno(), salarioAnual2);

        // APLICAR AUMENTO DEL 10%

        emp1.establecerSalarioMensual(emp1.obtenerSalarioMensual() * 1.10);
        emp2.establecerSalarioMensual(emp2.obtenerSalarioMensual() * 1.10);

        // MOSTRAR SALARIOS ANUALES CON AUMENTO

        System.out.println("\n-------------------------------------------");
        System.out.println("SALARIOS ANUALES CON EL 10% DE AUMENTO:");

        salarioAnual1 = emp1.obtenerSalarioMensual() * 12;
        salarioAnual2 = emp2.obtenerSalarioMensual() * 12;

        System.out.printf("%s %s: $%.2f al año%n",
                emp1.obtenerPrimerNombre(), emp1.obtenerApellidoPaterno(), salarioAnual1);
        System.out.printf("%s %s: $%.2f al año%n",
                emp2.obtenerPrimerNombre(), emp2.obtenerApellidoPaterno(), salarioAnual2);

        entrada.close();
    }
}
