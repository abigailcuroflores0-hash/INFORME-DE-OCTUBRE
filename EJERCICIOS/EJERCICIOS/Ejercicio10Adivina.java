
import java.util.Scanner;

public class Ejercicio10Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secreto = 50;
        int intentos = 0;
        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        while (numero != secreto) {
            intentos++;

            if (numero < secreto) {
                System.out.println("El numero es mayor");
            } else {
                System.out.println("El numero es menor");
            }

            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
        }

        intentos++;

        System.out.println("¡Correcto!");
        System.out.println("Intentos realizados: " + intentos);

        sc.close();
    }
}
