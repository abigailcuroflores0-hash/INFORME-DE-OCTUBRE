
import java.util.Scanner;

public class Ejercicio9Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;

        System.out.println("Saldo actual: S/ " + saldo);
        System.out.print("Retiro (0 para salir): ");
        double retiro = sc.nextDouble();

        while (retiro != 0) {
            if (retiro < 0) {
                System.out.println("Error: el retiro debe ser positivo.");
            } else if (retiro > saldo) {
                System.out.println("Error: saldo insuficiente.");
            } else {
                saldo = saldo - retiro;
                System.out.println("Saldo restante: S/ " + saldo);
            }

            System.out.print("Retiro (0 para salir): ");
            retiro = sc.nextDouble();
        }

        System.out.println("Gracias por utilizar el cajero.");
        System.out.println("Saldo final: S/ " + saldo);

        sc.close();
    }
}
