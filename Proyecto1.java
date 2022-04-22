import java.util.Scanner;

public class Proyecto1 {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de Juan");
        System.out.println("Introduzca el una cantidad en pasos y se le devolvera una cantidad en dólares");
        Scanner scanner = new Scanner (System.in);
        double Pesos = scanner.nextDouble();
        double dolares = 0.049 * Pesos;
        System.out.println(Pesos + " Pesos equivalen a " + dolares +" US dólares");
    }
}