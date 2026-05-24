import java.util.Scanner;

public class AnioBisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = teclado.nextInt();
        
        // Condición lógica para año bisiesto
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es BISIESTO.");
        } else {
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
        
        teclado.close();
    }
}