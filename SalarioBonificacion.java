import java.util.Scanner;

public class SalarioBonificacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su salario base: ");
        double salario = teclado.nextDouble();
        
        System.out.print("Ingrese sus años de trabajo: ");
        int anios = teclado.nextInt();
        
        if (anios > 5 && salario < 2000) {
            System.out.println("Resultado: Recibe el BONO COMPLETO.");
        } else if (anios > 5 || salario < 2000) {
            System.out.println("Resultado: Recibe un BONO MENOR (solo cumple un requisito).");
        } else {
            System.out.println("Resultado: Sin bono.");
        }
        
        teclado.close();
    }
}