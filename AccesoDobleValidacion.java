import java.util.Scanner;

public class AccesoDobleValidacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su usuario: ");
        String usuario = teclado.next(); // Lee la palabra "admin"
        
        System.out.print("Ingrese su contraseña (número): ");
        int contrasena = teclado.nextInt();
        
        // Validación combinada con .equals() que es obligatorio para Strings
        if (usuario.equals("admin") && contrasena == 1234) {
            System.out.println("Acceso correcto");
        } else {
            System.out.println("Acceso denegado");
        }
        
        teclado.close();
    }
}