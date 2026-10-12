import java.util.Scanner;

public class Comparacióndetresnúmeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = scanner.nextInt();
        
        int mayor, menor;
        
        // Encontrar el mayor
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        
        // Encontrar el menor
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        
        int diferencia = mayor - menor;
        
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("La diferencia entre ambos es: " + diferencia);
    }
}