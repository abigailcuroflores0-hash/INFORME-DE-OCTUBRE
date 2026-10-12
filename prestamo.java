import java.util.Scanner;

public class prestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el sueldo: ");
        double sueldo = scanner.nextDouble();
        
        double prestamoMaximo;
        if (sueldo >= 3000) {
            prestamoMaximo = sueldo * 5;
        } else {
            prestamoMaximo = sueldo * 2;
        }
        
        System.out.println("El monto máximo de préstamo que puede solicitar es: S/" + prestamoMaximo);
    }
}