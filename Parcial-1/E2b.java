import java.util.Scanner;

public class E2b {

    public static void main(String[] args) {
        // Solicitamos el peso de la mascota
        double peso = ingresarRealD("Por favor ingrese el peso de su mascota (kg): ");

        // Calculamos la tarifa y el descuento si aplica
        String resultado = calcularTarifaLavado(peso);

        // Mostramos el resultado en pantalla
        generarMensaje(resultado);
    }

    public static double ingresarRealD(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static String calcularTarifaLavado(double peso) {
        String mensaje = "";
        double descuento = 0.0;
        
        // Tarifas base según el peso
        double subtotalHastaDiezKg = peso * 35000;
        double subtotalMayor = peso * 50000;

        if (peso <= 10) {
            // Descuento del 10% para mascotas de hasta 10 kg
            descuento = subtotalHastaDiezKg * 0.10;
            double totalConDescuento = subtotalHastaDiezKg - descuento;

            mensaje = "El valor total a pagar con descuento aplicado es: $"
                    + totalConDescuento
                    + " (El descuento fue de: $" + descuento + ")";
        } else {
            // Sin descuento para mascotas de más de 10 kg
            mensaje = "Usted no aplica para el descuento, el valor a pagar es: $"
                    + subtotalMayor;
        }

        return mensaje;
    }

    public static void generarMensaje(String resultado) {
        System.out.println(resultado);
    }
}
