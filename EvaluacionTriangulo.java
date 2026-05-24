import java.util.Scanner;

public class EvaluacionTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el lado A: ");
        double a = teclado.nextDouble();
        System.out.print("Ingrese el lado B: ");
        double b = teclado.nextDouble();
        System.out.print("Ingrese el lado C: ");
        double c = teclado.nextDouble();
        
        // Verificar si forman un triángulo válido
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Los lados sí forman un triángulo.");
            
            // Clasificación
            if (a == b && b == c) {
                System.out.println("Tipo: Equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }
        } else {
            System.out.println("Error: Los lados no pueden formar un triángulo.");
        }
        
        teclado.close();
    }
}