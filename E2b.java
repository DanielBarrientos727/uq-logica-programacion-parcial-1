import java.util.Scanner;
public class E2b {
    static void main(String[] args) {
        double peso = ingresarRealD("Por favor ingrese el peso de su mascotica: ");
        String descuento = calculoDescuento(peso);
        generarMensaje (descuento);
    }
    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        double valor= sc.nextDouble();
        return valor;
    }
    public static String calculoDescuento(double peso){
        String mensaje = " ";
        double descuento = 0.0;
        double mascotapeso10 = peso*35000;
        double mascotapesomayor = peso*50000;
        if (peso <= 10){
            descuento = mascotapeso10 * 0.10;
            mascotapeso10 = mascotapeso10 - descuento;
            mensaje = "El valor total a pagar con descuento aplicado es: " + mascotapeso10+" y el descuento fue de: " +descuento;
        }
        else {
            mensaje = "Usted no aplica para el descuento, el valor a pagar es " +mascotapesomayor;
        }
        return mensaje;
    }
    public static void generarMensaje(String descuento){
        System.out.println(descuento);
    }
}