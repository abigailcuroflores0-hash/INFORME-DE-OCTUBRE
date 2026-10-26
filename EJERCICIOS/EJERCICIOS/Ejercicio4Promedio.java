
import java.util.Scanner;

public class Ejercicio4Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        double suma = 0;

        while (i <= 5) {
            System.out.print("Nota " + i + ": ");
            double nota = sc.nextDouble();

            while (nota < 0 || nota > 20) {
                System.out.println("Error: la nota debe estar entre 0 y 20.");
                System.out.print("Nota " + i + ": ");
                nota = sc.nextDouble();
            }

            suma = suma + nota;
            i++;
        }

        double promedio = suma / 5;

        System.out.println("Promedio: " + promedio);
        sc.close();
    }
}
