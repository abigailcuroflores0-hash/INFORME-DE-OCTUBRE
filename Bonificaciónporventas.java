import java.util.Scanner;

public class Bonificaciónporventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de ventas: ");
        double ventas = scanner.nextDouble();
        
        double bonificacion;
        if (ventas > 5000) {
            bonificacion = ventas * 0.10;
        } else {
            bonificacion = ventas * 0.05;
        }
        
        double total = ventas + bonificacion;
        
        System.out.println("Bonificación: S/" + bonificacion);
        System.out.println("Total (ventas + bonificación): S/" + total);
    }
}
