import java.util.Scanner;

public class Controldepeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        
        if (peso <= 50) {
            System.out.println("El paquete es aceptado.");
        } else {
            double exceso = peso - 50;
            System.out.println("Paquete rechazado. Sobrepasa por: " + exceso + " kg.");
        }
    }
}