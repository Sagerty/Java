import java.awt.*;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        int empiezaeljeuego;
        System.out.println("Bienvenido a mi juego");
        System.out.println("Escriba 1 para empezar y 2 para cerrar");
        Scanner scanner = new Scanner(System.in);
        empiezaeljeuego = scanner.nextInt();
        int opcion;
        int suma;
        suma = 0;
        if (empiezaeljeuego == 1) {
            do {
                do {
                    System.out.println(" \033[33mEstas en un cuarto oscuro, ¿Que haces?");
                    System.out.println("\033[34m1. Buscas una pared 2. Llamas a alguien");
                    Scanner scanner1 = new Scanner(System.in);
                    opcion = scanner1.nextInt();
                    if (opcion == 2) {
                        System.out.println("\033[31mGritas *Holaaaaa* *Alguien* pero nadie contesta");
                    }
                } while (opcion == 2);
                int opcions;
                System.out.println("\033[31mEncontraste un interruptor, lo activas");
                do {
                    System.out.println("\033[33mVuelves a el centro de la habitacion, Encuentras una puerta enfrente de ti, un mueble algo rustico a tu izquierda, atras una cama y una mesita de noche al lado derecho de la cama");
                    System.out.println("\033[33m¿Que haces? 1. Tratas de abrir la puerta 2. Investigas en el mueble rustico 3. Saltas en la cama >:3 4. Revisas la mesita de noche 5. o Te rindes");
                    Scanner scanner2 = new Scanner(System.in);
                    opcions = scanner2.nextInt();
                    if (opcions == 1) {
                        System.out.println("\033[31mTratas de abrir la puerta pero esta cerrada");
                    } else if (opcions == 2) {
                        System.out.println("\033[31mEncuentras una llave");
                    }
                    else if (opcions == 3) {
                        System.out.println("\033[31mEstas brincando en la cama, se te llena de alegria tu corazon aunque la cama este algo dura, pero igualmente te bajas y la vuelves a tender");
                    }
                    else if (opcions == 4) {
                        System.out.println("\033[31mRevisas la mesita de noche y encuentras una papel que dice *Cuando no has descongelado el pollo y llega tu mama* le das la vuelta al papel y dice *Es cuando se me ocurrio la brillante idea de fingir mi muerte*,Te ries tan fuerte que te empieza a doler el cerebro asi que dejas el papel en la mesita de noche");
                    }
                } while (opcions == 1 || opcions == 3 || opcions == 4);
                if (opcions == 5) {
                    System.out.println("\033[33mAdios LOSEEERRRR");
                    break;
                }
                System.out.println("\033[31mDecides abrir la puerta");
                int opcionafuera;
                int linterna;
                linterna = 0;
                int ladecisiondelcuartooscuro;
                int bellota;
                bellota = 0;
                int salir;
                salir = 0;
                do {
                    System.out.println("\033[33mEncuentras un patio enfrente de ti, un arbol con un hoyo, una casita tipo de camping y dos puertas una a la derecha y la otra a la izquierda");
                    System.out.println("\033[33m¿Que vas a hacer? 1. Revisar el arbol 2. Hacer camping en la casita 3. Tratar de abrir la puerta izquierda 4. Tratar de abrir la puerta derecha 5. O rendirte");
                    Scanner scanner3 = new Scanner(System.in);
                    opcionafuera = scanner3.nextInt();
                    int linterna2;
                    linterna2 = 0;
                    if (opcionafuera == 1) {
                        System.out.println("\033[31mEncuentras una bellota y empiezas a escuchar un ruido que viene de la parte alta del arbol, resulta que la bellota era de una ardilla rabiosa, te rasguña toda la cara y le regresas la bellota >:(");
                    }
                    else if (opcionafuera == 2) {
                        System.out.println("\033[31mTe metes y tratas de hacer camping, encuentras comida y una linterna, pero no te comes la comida porque extrañamente no tienes hambre");
                        System.out.println("\033[31mTomas la linterna pero la dejas porque no sirve");
                    }
                    else if (opcionafuera == 3 ) {
                        System.out.println("\033[31mTratas de abrir la puerta pero como te imaginaste la puerta no se abre");
                    }
                    else if (opcionafuera == 4) {
                        System.out.println("\033[33mSorprendentmente se abre la puerta pero el cuarto esta algo oscuro");
                        System.out.println("\033[33mQue haces, 1. Te metes 2. sigues investigando el cuarto en el que estas");
                        Scanner scanner4 = new Scanner(System.in);
                        ladecisiondelcuartooscuro = scanner4.nextInt();
                        if (ladecisiondelcuartooscuro == 1) {
                            System.out.println("\033[31mTratas de entrar pero el cuarto esta oscuro,buscas el interruptor pero cuando lo encuentras el interruptor no funcionaba, ya terminaste la demo");
                            System.out.println("\033[31mAdios");
                            break;
                        }
                    }
                }while (salir == 0);
                break;
            } while (empiezaeljeuego == 1 || suma == 0);
        }
        else if (empiezaeljeuego == 2) {
            System.out.println("Adios");
        }
    }
}