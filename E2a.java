//Ejercicio 2a

import java.util.Scanner;

public class E2a {

    static void main(String[] args) {

        double consumoHogar = ingresarRealD("¿Cuántos litros de agua consumen al día en el hogar? ");

        int personas = ingresarEntero("¿Cuántas personas viven en el hogar? ");

        double promedio = calculoPromedio(consumoHogar, personas);

        String consumoTotal = calculoConTot(promedio); // calculo consumo total

        generarMensaje(consumoHogar, promedio, consumoTotal);
    }

    public static double ingresarRealD(String mensaje) {

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        double valor = sc.nextDouble();

        return valor;
    }

    public static int ingresarEntero(String mensaje) {

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        int valor = sc.nextInt();

        return valor;
    }

    public static double calculoPromedio(double consumoHogar, int personas) {

        double promedio = consumoHogar / personas;

        return promedio;
    }

    public static String calculoConTot(double promedio) {

        String mensaje = " ";

        if (promedio <= 100) {

            mensaje = " Su hogar tiene el consumo de agua adecuado";

        } else {

            mensaje = " Su hogar se está excediendo con el consumo de agua";
        }

        return mensaje;
    }

    public static void generarMensaje(double consumoHogar, double promedio, String consumoTotal) {

        String mensajeF = "Los litros gastados al día fueron: " + consumoHogar
                + " El promedio es de: " + promedio + consumoTotal;

        System.out.println(mensajeF);
    }
}
