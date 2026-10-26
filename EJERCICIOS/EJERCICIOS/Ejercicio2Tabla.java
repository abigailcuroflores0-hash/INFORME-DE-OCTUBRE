
import java.util.Scanner;

public class Ejercicio2Tabla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        int i = 1;

        while (i <= 12) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        sc.close();
    }
}
