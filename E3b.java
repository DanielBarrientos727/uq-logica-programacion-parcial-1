//Ejercicio E3b

//Inicio del programa 
import java.util.Scanner;

// Usamos Scanner para poder ingresar datos desde la terminal.

public class E3b {

    public static void main(String[] args) {

        // En el main se pide el dato que necesita el programa.

        double consumo = ingresarRealD("¿Cuál es el consumo de combustible? ");

        // double porque el consumo puede tener decimales.

        String clasificacion = calcularClasificacion(consumo);

        // Se manda el consumo a calcularClasificacion(), que determina la clasificación.
        // El resultado se guarda en clasificacion.

        generarMensaje(clasificacion);

        // Finalmente, se muestra el resultado en pantalla.

    }

    public static double ingresarRealD(String mensaje) {

        // Esta función permite ingresar un número decimal.

        Scanner sc = new Scanner(System.in);

        System.out.print(mensaje);

        double valor = sc.nextDouble();

        // nextDouble() lee el número decimal que ingresa el usuario.

        return valor;

        // Retorna el valor ingresado.

    }

    public static String calcularClasificacion(double consumo) {

        // Esta función recibe el consumo y determina en qué categoría está.

        String mensaje = " ";

        if (consumo >= 15) {

            // Si el consumo es mayor o igual a 15, se considera eficiente.

            mensaje = "Consumo eficiente";

        } else if (consumo >= 10) {

            // else if significa "sino, si".
            // O sea, si no cumplió el if anterior, revisa esta nueva condición.

            mensaje = "Consumo moderado";

        } else {

            // Si no cumple ninguna de las condiciones anteriores, llega al else.

            mensaje = "Consumo alto";

        }

        return mensaje;

        // Retorna la clasificación correspondiente.

    }

    public static void generarMensaje(String clasificacion) {

        // Recibe la clasificación y la muestra en pantalla.

        String mensaje = "Clasificación: " + clasificacion;

        // Usamos + para unir el texto con el contenido de clasificacion.

        System.out.println(mensaje);

        // Muestra el mensaje final en la terminal.

    }

}

//Fin del programa 
