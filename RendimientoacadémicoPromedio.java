import java.util.Scanner;

public class RendimientoacadémicoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el promedio (0-20): ");
        int promedio = scanner.nextInt();
        
        if (promedio < 11) {
            System.out.println("Rendimiento: Desaprobado");
        } else if (promedio >= 11 && promedio <= 14) {
            System.out.println("Rendimiento: Regular");
        } else if (promedio >= 15 && promedio <= 17) {
            System.out.println("Rendimiento: Bueno");
        } else if (promedio >= 18 && promedio <= 20) {
            System.out.println("Rendimiento: Excelente");
        } else {
            System.out.println("Promedio no válido.");
        }
    }
}