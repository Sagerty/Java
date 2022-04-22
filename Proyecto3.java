import java.util.Scanner;
public class Proyecto3 {

    public static void main(String[] args) {
        int opcionSeleccionada;
        do {
            int saldo;
            saldo = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Elija una de las siguientes opciones");
            System.out.println("  Escribe 1 para consultar su saldo");
            System.out.println("  Escribe 2 para ingresar dinero");
            System.out.println("  Escribe 3 para sacar dinero");
            System.out.println("  Escribe 4 para consultar sus ultimos movimientos");
            System.out.println("Eliga un numero fuera de las opciones para terminar de usar el cajero");
            System.out.println("Minimo monto de 50 pesos");
            opcionSeleccionada = scanner.nextInt();
            if (opcionSeleccionada == 1) {
                System.out.println("Su saldo es de " + saldo + " Pesos");
            } else if (opcionSeleccionada == 2) {
                System.out.println("Cuanto dinero quisiera depositar");
                Scanner scanner1 = new Scanner(System.in);
                int opcionseleccionada2 = scanner1.nextInt();
                int saldofinal2;
                saldofinal2 = saldo + opcionseleccionada2;
                        System.out.println("Transaccion exitosa");
                System.out.println("Su saldo es de " + saldofinal2 + " Pesos" );
            }
            else if (opcionSeleccionada == 3) {
                System.out.println("Cuanto dinero quiere sacar");
                Scanner scanner2 = new Scanner(System.in);
                int opcionseleccionada3 = scanner2.nextInt();
                if (opcionseleccionada3 >= 50){
                    System.out.println("Transaccion completada");
                    int saldofinal3;
                    saldofinal3 = saldo - opcionseleccionada3;
                    System.out.println("Su saldo final es: " + saldofinal3 + " Pesos");
                }
                else {
                    System.out.println("No se puede hacer esa transacion");
                }
            } else if  (opcionSeleccionada == 4) {
                System.out.println("Su ultima transaccion fue hoy");
            }
        }while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);



    }
    }