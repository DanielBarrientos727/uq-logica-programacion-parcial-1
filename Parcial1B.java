import java.util.Scanner;

public class Parcial1B {

    public static void main(String[] args) {
        double compra = ingresarRealD("Ingrese el valor de su compra: ");
        boolean cliente = ingresarBoolean("¿El cliente es frecuente?: ");
        double edad = ingresarRealD("Ingrese la edad del usuario: ");
        String descuento = calcularDescuento(compra, cliente, edad);
        generarMensaje(descuento);
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }

    public static boolean ingresarBoolean(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        boolean valor = sc.nextBoolean();
        return valor;
    }

    public static String calcularDescuento(double compra, boolean cliente, double edad) {
        String entrada = "";
        if (compra > 200000 && cliente) {
            entrada = "Felicidades, usted recibe un descuento especial";
        } else {
            entrada = "Lo lamentamos, usted no recibe un descuento especial";
        }

        if (edad > 65) {
            entrada = "Felicidades, usted recibe un descuento especial";
        }
        return entrada;
    }

    public static void generarMensaje(String descuento) {
        String mensaje = "Se le informa que: " + descuento;
        System.out.println(mensaje);
    }
}