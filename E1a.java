import java.util.Scanner;
public class E1a {
    public static void main(String[] args) {
        int edad = ingresarEntero ("¿Cuál es su edad?");
        double altura = ingresarRealD ("¿Cuál es su altura?");
        String restriccion = calculoRestriccion (edad, altura);
        generarMensaje (restriccion);
    }
    public static int ingresarEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int valor = sc.nextInt();
        return valor;
    }
    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        return valor;
    }
    public static String calculoRestriccion (int edad, double altura){
        String mensaje = " ";
        if (edad >= 12 && altura > 1.40){
            mensaje = "Bienvenido, puede ingresar a la atracción";
        }
        else{
            mensaje = "No puede ingresar a la atracción :(";
        }
        if (edad > 60){
            mensaje = "Bienvenido, puede ingresar a la atracción";
        }
        return mensaje;
    }
    public static void generarMensaje (String restriccion){
        String mensaje = restriccion;
        System.out.println(mensaje);
    }
}