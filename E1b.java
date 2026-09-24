//Ejercicio 1b

import java.util.Scanner;

// Usamos Scanner para poder ingresar datos desde la terminal.

public class E1b {

    public static void main(String[] args) {

        // En el main se piden los datos que necesita el programa.

        double valorCompra = ingresarRealD("¿Cuál el valor de la compra? ");

        // double porque el valor de la compra puede tener decimales.

        boolean clienteFrecuente = ingresarBoolean("¿Es un cliente frecuente? ");

        // boolean sirve para guardar únicamente dos valores: true o false.
        // En este caso, nos dice si el cliente es frecuente o no.

        int edad = ingresarEntero("¿Cuál es la edad del cliente? ");

        // int porque la edad es un número entero.

        String valorFinal = calculoDescuento(valorCompra, clienteFrecuente, edad);

        // Acá se manda la información a calculoDescuento(), que decide si el cliente aplica o no al descuento.
        // El resultado se guarda en valorFinal.

        generarMensaje(valorFinal);

        // Finalmente, se manda el resultado a generarMensaje() para mostrarlo en pantalla.

    }

    public static double ingresarRealD(String mensaje) {

        // Esta función recibe un mensaje y permite ingresar un número decimal.

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        double valor = sc.nextDouble();

        // nextDouble() lee el número decimal que ingresa el usuario.

        return valor;

        // Retorna el valor ingresado.

    }

    public static int ingresarEntero(String mensaje) {

        // Esta función recibe un mensaje y permite ingresar un número entero.

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        int valor = sc.nextInt();

        // nextInt() lee el número entero que ingresa el usuario.

        return valor;

    }

    public static boolean ingresarBoolean(String mensaje) {

        // Esta función es nueva. Sirve para ingresar un valor booleano, o sea true o false.

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        boolean valor = sc.nextBoolean();

        // nextBoolean() lee si el usuario ingresa true o false.

        return valor;

        // Retorna ese valor booleano.

    }

    public static String calculoDescuento(double valorCompra, boolean clienteFrecuente, int edad) {

        // Esta función recibe tres datos: el valor de la compra, si es cliente frecuente y la edad.
        // Luego devuelve un String con el resultado.

        String mensaje = " ";

        if (valorCompra > 200000 && clienteFrecuente == true) {

            // Si la compra es mayor a 200000 y el cliente es frecuente, aplica al descuento.

            mensaje = "usted aplica para el descuento";

        } else {

            // Si no cumple con las dos condiciones, no aplica al descuento.

            mensaje = "usted NO aplica para el descuento";

        }

        if (edad > 65) {

            // Si tiene más de 65 años, también aplica al descuento.

            mensaje = "usted aplica para el descuento";

        }

        return mensaje;

        // Retorna el mensaje con el resultado.

    }

    public static void generarMensaje(String valorFinal) {

        // Recibe el resultado y lo muestra en pantalla.

        String mensaje = "Para la promoción " + valorFinal;

        // Acá usamos + para unir textos.
        // Se junta "Para la promoción " con el contenido de valorFinal.

        System.out.println(mensaje);

        // Muestra el mensaje final en la terminal.

    }

}