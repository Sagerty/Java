import java.util.Scanner;

public class Proyecto2 {
    public static void main(String[] args) {
            System.out.println("Bienvenid@ al divisor de java");
            System.out.println("Introduzca un entero");
            Scanner scanner = new Scanner(System.in);
            int numero1 = scanner.nextInt();
            System.out.println("Introduzca un segundo entero");
            Scanner scanner2 = new Scanner(System.in);
            int numero2 = scanner2.nextInt();
            int resultado;
            resultado = numero2 == 0?0: numero1 / numero2;
            System.out.println("Su resultado es " + resultado);
    }
}