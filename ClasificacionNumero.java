import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {
        // Corrección: Inicialización limpia del Scanner
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();
        
        // Determinar si es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es: Positivo");
        } else if (numero < 0) {
            System.out.println("El número es: Negativo");
        } else {
            System.out.println("El número es: Cero");
        }
        
        // Determinar si es par o impar
        if (numero % 2 == 0) {
            System.out.println("Además, es: Par");
        } else {
            System.out.println("Además, es: Impar");
        }
        
        teclado.close();
    }
}