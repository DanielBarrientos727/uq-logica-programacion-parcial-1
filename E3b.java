import java.util.Scanner;

public class E3b {

    public static void main(String[] args) {

        double consumo = ingresarRealD("¿Cuál es el consumo de combustible? ");

        String clasificacion = calcularClasificacion(consumo);

        generarMensaje(clasificacion);
    }

    public static double ingresarRealD(String mensaje) {

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        double valor = sc.nextDouble();

        return valor;
    }

    public static String calcularClasificacion(double consumo) {

        String mensaje = " ";

        if (consumo >= 15) {

            mensaje = "Consumo eficiente";

        } else if (consumo >= 10) {

            mensaje = "Consumo moderado";

        } else {

            mensaje = "Consumo alto";
        }

        return mensaje;
    }

    public static void generarMensaje(String clasificacion) {

        String mensaje = "Clasificación: " + clasificacion;

        System.out.println(mensaje);
    }
}
