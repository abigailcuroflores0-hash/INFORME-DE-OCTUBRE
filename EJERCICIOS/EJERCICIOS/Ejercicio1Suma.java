
import java.util.Scanner;

public class Ejercicio1Suma {
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
        int suma = 0;

        while (i <= n) {
            suma = suma + i;
            i++;
        }

        System.out.println("Resultado: " + suma);

        sc.close();
    }
}