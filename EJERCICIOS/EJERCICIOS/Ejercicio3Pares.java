
import java.util.Scanner;

public class Ejercicio3Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Error: ingrese un entero positivo.");
            System.out.print("Ingrese N: ");
            n = sc.nextInt();
        }

        int i = 1;
        int cantidad = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                cantidad++;
            }
            i++;
        }

        System.out.println("Cantidad de pares: " + cantidad);
        sc.close();
    }
}
