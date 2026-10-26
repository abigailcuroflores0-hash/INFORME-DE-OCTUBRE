
import java.util.Scanner;

public class Ejercicio6Digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero de tres o mas cifras: ");
        long n = sc.nextLong();

        while (n < 100) {
            System.out.println("Error: ingrese un entero positivo de tres o mas cifras.");
            System.out.print("Ingrese un numero: ");
            n = sc.nextLong();
        }

        int cantidad = 0;

        while (n > 0) {
            n = n / 10;
            cantidad++;
        }

        System.out.println("Cantidad de digitos: " + cantidad);
        sc.close();
    }
}
