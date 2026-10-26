
import java.util.Scanner;

public class Ejercicio5Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un entero no negativo: ");
        int n = sc.nextInt();

        while (n < 0 || n > 20) {
            System.out.println("Error: ingrese un numero entre 0 y 20.");
            System.out.print("Ingrese un entero no negativo: ");
            n = sc.nextInt();
        }

        int i = 1;
        long factorial = 1;

        while (i <= n) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial = " + factorial);
        sc.close();
    }
}
