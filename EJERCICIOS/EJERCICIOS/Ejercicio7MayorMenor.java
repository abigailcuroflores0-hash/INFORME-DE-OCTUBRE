
import java.util.Scanner;

public class Ejercicio7MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double mayor = 0;
        double menor = 0;

        System.out.println("Ingrese 10 numeros:");

        while (i <= 10) {
            System.out.print("Numero " + i + ": ");
            double numero = sc.nextDouble();

            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            i++;
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
