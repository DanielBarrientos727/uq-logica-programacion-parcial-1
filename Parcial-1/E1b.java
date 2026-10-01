import java.util.Scanner;

public class E1b {

    public static void main(String[] args) {
        // Pedimos los datos necesarios al usuario
        double valorCompra = ingresarRealD("¿Cuál es el valor de la compra? ");
        boolean clienteFrecuente = ingresarBoolean("¿Es un cliente frecuente? (true/false): ");
        int edad = ingresarEntero("¿Cuál es la edad del cliente? ");

        // Evaluamos si aplica al descuento
        String valorFinal = calculoDescuento(valorCompra, clienteFrecuente, edad);

        // Mostramos el resultado
        generarMensaje(valorFinal);
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static boolean ingresarBoolean(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextBoolean();
    }

    public static String calculoDescuento(double valorCompra, boolean clienteFrecuente, int edad) {
        String mensaje = "usted NO aplica para el descuento";

        // Aplica si la compra es mayor a 200,000 y es cliente frecuente, o si tiene más de 65 años
        if ((valorCompra > 200000 && clienteFrecuente) || edad > 65) {
            mensaje = "usted aplica para el descuento";
        }

        return mensaje;
    }

    public static void generarMensaje(String valorFinal) {
        System.out.println("Para la promoción " + valorFinal);
    }
}
