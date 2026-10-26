
import java.util.Scanner;

public class Ejercicio8Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de terminos: ");
        int n = sc.nextInt();

        while (n < 1 || n > 92) {
            System.out.println("Error: ingrese una cantidad entre 1 y 92.");
            System.out.print("Ingrese cantidad de terminos: ");
            n = sc.nextInt();
        }

        long a = 0;
        long b = 1;
        int i = 1;

        while (i <= n) {
            System.out.print(a + " ");

            long siguiente = a + b;
            a = b;
            b = siguiente;

            i++;
        }

        System.out.println();
        sc.close();
    }
}
