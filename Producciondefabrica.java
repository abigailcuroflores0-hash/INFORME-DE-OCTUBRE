import java.util.Scanner;

public class Producciondefabrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de piezas producidas: ");
        int piezas = scanner.nextInt();
        
        double salarioBase = piezas * 5.0;
        double porcentajeIncentivo;
        
        if (piezas > 1000) {
            porcentajeIncentivo = 0.15;
        } else {
            porcentajeIncentivo = 0.08;
        }
        
        double incentivo = salarioBase * porcentajeIncentivo;
        double totalRecibir = salarioBase + incentivo;
        
        System.out.println("Salario base: S/" + salarioBase);
        System.out.println("Incentivo: S/" + incentivo);
        System.out.println("Total a recibir: S/" + totalRecibir);
    }
}