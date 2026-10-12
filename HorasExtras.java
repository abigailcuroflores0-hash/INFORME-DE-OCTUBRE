import java.util.Scanner;

public class HorasExtras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horas = scanner.nextInt();
        
        double salarioTotal;
        if (horas > 40) {
            int horasNormales = 40;
            int horasExtras = horas - 40;
            salarioTotal = (horasNormales * 20) + (horasExtras * 20 * 2);
        } else {
            salarioTotal = horas * 20;
        }
        
        System.out.println("El salario total es: S/" + salarioTotal);
    }
}