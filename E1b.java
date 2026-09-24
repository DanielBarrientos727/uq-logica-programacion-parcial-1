//Ejercicio 1b

import java.util.Scanner;

public class E1b {

    public static void main(String[] args) {

        double valorCompra = ingresarRealD("¿Cuál el valor de la compra? ");

        boolean clienteFrecuente = ingresarBoolean("¿Es un cliente frecuente? ");

        int edad = ingresarEntero("¿Cuál es la edad del cliente? ");

        String valorFinal = calculoDescuento(valorCompra, clienteFrecuente, edad);

        generarMensaje(valorFinal);
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

    public static boolean ingresarBoolean(String mensaje) {

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        boolean valor = sc.nextBoolean();

        return valor;
    }

    public static String calculoDescuento(double valorCompra, boolean clienteFrecuente, int edad) {

        String mensaje = " ";

        if (valorCompra > 200000 && clienteFrecuente == true) {

            mensaje = "usted aplica para el descuento";

        } else {

            mensaje = "usted NO aplica para el descuento";
        }

        if (edad > 65) {

            mensaje = "usted aplica para el descuento";
        }

        return mensaje;
    }

    public static void generarMensaje(String valorFinal) {

        String mensaje = "Para la promoción " + valorFinal;

        System.out.println(mensaje);
    }
}