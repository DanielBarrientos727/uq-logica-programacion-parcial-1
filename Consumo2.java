import java.util.Scanner;

public class Consumo2 {

    public static void main(String[] args) {
        double distancia = ingresarRealD("Ingrese la distancia recorrida en kilómetros: ");
        double combustible = ingresarRealD("Ingrese el combustible usado en litros: ");
        double consumo = calculoConsumo(distancia, combustible);
        String clasificacion = calcularClasificacion(consumo);
        mostrarMensaje(consumo, clasificacion);
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

    public static String calcularClasificacion(double consumo) {
        String entrada = "";
        if (consumo >= 15) {
            entrada = "Consumo eficiente";
        }
        if (consumo >= 10 && consumo <= 14.99) {
            entrada = "Consumo moderado";
        }
        if (consumo < 10) {
            entrada = "Consumo alto";
        }
        return entrada;
    }

    public static void mostrarMensaje(double consumo, String clasificacion) {
        String mensaje = "Hola :), su consumo es de: " + consumo + " Su clasificación es: " + clasificacion;
        System.out.println(mensaje);
    }
}