import java.util.Scanner;
public class E3a {
    static void main(String[] args) {
        double kilometros = ingresarRealD("Por favor ingrese cuál fue la distancia que recorrió: ");
        double combustible = ingresarRealD("Por favor ingrese cuánto combustible usó: ");
        double consumo = calculoConsumo(kilometros, combustible);
        mostrarMensaje(consumo);
    }
    public static double ingresarRealD(String mensaje){
        Scanner sc=new Scanner(System.in);
        System.out.print(mensaje);
        double valor=sc.nextDouble();
        return valor;
    }
    public static double calculoConsumo(double kilometros, double combustible){
        double consumo= kilometros/combustible;
        return consumo;
    }
    public static void mostrarMensaje(double consumo){
        String mensaje="El consumo fue de:"+consumo;
        System.out.print(mensaje);
    }
}