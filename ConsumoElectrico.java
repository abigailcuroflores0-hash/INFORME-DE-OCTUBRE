import java.util.Scanner;

public class ConsumoElectrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el consumo en kWh: ");
        double kwh = scanner.nextDouble();
        
        double montoPagar;
        if (kwh <= 100) {
            montoPagar = kwh * 0.80;
        } else {
            montoPagar = kwh * 1.20;
        }
        
        System.out.println("El monto a pagar es: S/" + montoPagar);
    }
}