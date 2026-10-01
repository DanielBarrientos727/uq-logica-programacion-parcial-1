import java.util.Scanner;

public class Reutilizacion {

    public static String ingresarTexto(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = scanner.nextLine();
        return texto;
    }

    public static double ingresarRealD(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        double valorRealD = scanner.nextDouble();
        return valorRealD;
    }

    public static float ingresarRealF(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        float valorRealF = scanner.nextFloat();
        return valorRealF;
    }

    public static int ingresarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int valorEntero = scanner.nextInt();
        return valorEntero;
    }

    public static boolean ingresarBoolean(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        boolean respuesta = scanner.nextBoolean();
        return respuesta;
    }
}