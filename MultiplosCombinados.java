import java.util.Scanner;

public class MultiplosCombinados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();
        
        // Se evalúa primero la condición más estricta (ambos múltiplos)
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("El número no es múltiplo de 3 ni de 5.");
        }
        
        teclado.close();
    }
}