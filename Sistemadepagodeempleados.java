import java.util.Scanner;

public class Sistemadepagodeempleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el salario bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // 1. Cálculo de impuestos
        double impuesto;
        if (salarioBruto > 2500) {
            impuesto = salarioBruto * 0.12;
        } else {
            impuesto = salarioBruto * 0.07;
        }

        // 2. Cálculo de bono por horas extras (> 48 horas)
        double bono = 0.0;
        if (horasTrabajadas > 48) {
            bono = 300.0;
        }

        // 3. Cálculo del salario neto
        double salarioNeto = (salarioBruto - impuesto) + bono;

        // Resultados
        System.out.println("\n--- BOLETA DE PAGO ---");
        System.out.println("Salario Bruto : S/" + salarioBruto);
        System.out.println("Impuesto      : S/" + impuesto);
        System.out.println("Bono          : S/" + bono);
        System.out.println("Salario Neto  : S/" + salarioNeto);
    }
}