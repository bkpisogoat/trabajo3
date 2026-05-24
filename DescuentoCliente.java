import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el monto de la compra: ");
        double monto = teclado.nextDouble();
        
        System.out.print("¿Es cliente VIP? (si/no): ");
        String tipoCliente = teclado.next(); // Cambiado a next() para evitar saltos de línea
        
        double descuento = 0;
        
        // Lógica de descuentos anidados
        if (monto > 500) {
            if (tipoCliente.equalsIgnoreCase("si")) {
                descuento = monto * 0.20; // 20%
                System.out.println("¡Aplicó descuento VIP del 20%!: $" + descuento);
            } else {
                descuento = monto * 0.10; // 10%
                System.out.println("Aplicó descuento regular del 10%: $" + descuento);
            }
        } else {
            System.out.println("Sin descuento.");
        }
        
        System.out.println("Monto final a pagar: $" + (monto - descuento));
        teclado.close();
    }
}