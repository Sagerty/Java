public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double radio = 4.0;
        double area = calculadora.calcularAreaCirculo(radio);
        System.out.println("El area de un circulo de radio 4 es " + area);
    }
}