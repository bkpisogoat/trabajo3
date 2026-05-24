import java.util.Scanner;

public class ValidarPasswordRango {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cree una contraseña (número de 4 dígitos): ");
        int password = teclado.nextInt();
        
        if (password > 1000 && password < 9999) {
            System.out.println("Contraseña válida y segura.");
        } else {
            System.out.println("Contraseña inválida (debe estar entre 1001 y 9998).");
        }
        
        teclado.close();
    }
}