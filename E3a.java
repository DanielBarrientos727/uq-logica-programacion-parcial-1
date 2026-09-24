//Ejercicio 3a

import com.sun.source.tree.IfTree;
import java.util.Scanner;

public class E3a {

    static void main(String[] args) {

        double kilometros = ingresarRealD("Por favor ingrese cuál fue la distancia que recorrió: ");

        double combustible = ingresarRealD("Por favor ingrese cuánto combustible usó: ");

        double consumo = calculoConsumo(kilometros, combustible);

        String clasificacion = calculoClasificacion(consumo);

        mostrarMensaje(consumo, clasificacion);
    }

    public static double ingresarRealD(String mensaje) {

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        double valor = sc.nextDouble();

        return valor;
    }

    public static double calculoConsumo(double kilometros, double combustible) {

        double consumo = kilometros / combustible;

        return consumo;
    }

    public static String calculoClasificacion(double consumo) {

        String mensaje = " ";

        if (consumo >= 15) {

            mensaje = " El consumo ha sido eficiente";
        }

        if (consumo >= 10 && consumo <= 14.99) {

            mensaje = " El consumo ha sido moderado";
        }

        if (consumo < 10) {

            mensaje = " El consumo ha sido alto";
        }

        return mensaje;
    }

    public static void mostrarMensaje(double consumo, String clasificacion) {

        String mensaje = "El consumo fue de:" + consumo + clasificacion;

        System.out.print(mensaje);
    }
}