//Ejercicio 2a

// Inicio del programa

import java.util.Scanner;

// Nuevamente acá usamos el Scanner para poder ingresar datos desde la terminal, y supongo que la shell lo debe de entender.

public class E2a {

    static void main(String[] args) {

        // En el main se va a pedir los datos al usuario

        double consumoHogar = ingresarRealD("¿Cuántos litros de agua consumen al día en el hogar? ");

        // double porque el consumo puede tener decimales.

        int personas = ingresarEntero("¿Cuántas personas viven en el hogar? ");

        // int porque la cantidad de personas es un número entero.

        double promedio = calculoPromedio(consumoHogar, personas);

        // Acá se calcula el promedio de consumo por persona y se guarda en promedio.

        String consumoTotal = calculoConTot(promedio); // calculo consumo total

        // Acá se manda el promedio a calculoConTot(), que revisa si el consumo es adecuado o no.
        // El resultado se guarda en consumoTotal.

        generarMensaje(consumoHogar, promedio, consumoTotal);

        // Finalmente, se mandan los resultados a generarMensaje() para mostrarlos en pantalla.

    }

    public static double ingresarRealD(String mensaje) {

        // Esta función permite ingresar un número decimal, el souble. 

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        double valor = sc.nextDouble();

        // nextDouble() lee el número decimal que ingresa el usuario

        return valor;

        // Retorna el valor ingresado

    }

    public static int ingresarEntero(String mensaje) {

        // Esta función permite ingresar un número entero, el int pues 

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        int valor = sc.nextInt();

        // nextInt() lee el número entero que ingresa el usuario.

        return valor;

    }

    public static double calculoPromedio(double consumoHogar, int personas) {

        // Esta función recibe el consumo de la vivienda y la cantidad de personas.

        double promedio = consumoHogar / personas;

        // Se divide el consumo total entre las personas para obtener el consumo promedio por persona.

        return promedio;

        // Retorna el promedio de la edad. 

    }

    public static String calculoConTot(double promedio) {

        // Esta función recibe el promedio y revisa si el consumo es adecuado, a lo acordado 

        String mensaje = " ";

        if (promedio <= 100) {

            // Si el promedio es menor o igual a 100 litros, el consumo se considera adecuado

            mensaje = " Su hogar tiene el consumo de agua adecuado";

        } else {

            // Si supera los 100 litros de agua, se considera que hay ya un exceso de consumo

            mensaje = " Su hogar se está excediendo con el consumo de agua";

        }

        return mensaje;

        // Retorna el mensaje correspondiente

    }

    public static void generarMensaje(double consumoHogar, double promedio, String consumoTotal) {

        // Recibe los resultados y los muestra en pantalla 

        String mensajeF = "Los litros gastados al día fueron: " + consumoHogar
                + " El promedio es de: " + promedio + consumoTotal;

        // Usamos + para unir textos con variables y formar un solo mensaje.

        System.out.println(mensajeF);

        // Muestra el mensaje final en la terminal

    }

}

// Fin del programa