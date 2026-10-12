import java.util.Scanner;

public class tarifadetaxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los kilómetros recorridos: ");
        double km = scanner.nextDouble();
        
        double tarifaTotal;
        if (km <= 3) {
            tarifaTotal = 8.0;
        } else {
            double kmAdicionales = km - 3;
            tarifaTotal = 8.0 + (kmAdicionales * 2.50);
        }
        
        System.out.println("La tarifa total del taxi es: S/" + tarifaTotal);
    }
}