import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        double distancia = ingresarRealD("Ingrese la distancia recorrida en kilómetros: ");
        double combustible = ingresarRealD("Ingrese el combustible usado en litros: ");
        double consumo = calculoConsumo(distancia, combustible);
        mostrarMensaje(consumo);
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static double calculoConsumo(double distancia, double combustible) {
        double consumo = distancia / combustible;
        return consumo;
    }

    public static void mostrarMensaje(double consumo) {
        String mensaje = "Hola :), su consumo es de: " + consumo;
        System.out.println(mensaje);
    }
}