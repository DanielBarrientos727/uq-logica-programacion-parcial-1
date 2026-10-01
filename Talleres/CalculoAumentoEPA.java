public class CalculoAumentoEPA {

    public static void main(String[] args) {
        double consumo = Reutilizacion.ingresarRealD(
                "Ingrese el consumo mensual en m3 de su hogar: "
        );

        double valorActual = Reutilizacion.ingresarRealD(
                "Ingrese el valor actual del servicio a pagar: "
        );

        generarMensajeConsumo(consumo, valorActual);
    }

    public static void generarMensajeConsumo(double consumoMensual, double valorActual) {
        double porcentaje = 0;

        if (consumoMensual >= 1 && consumoMensual <= 9) {
            porcentaje = 0.15;
        } else if (consumoMensual >= 13 && consumoMensual <= 15) {
            porcentaje = 0.15;
        } else if (consumoMensual >= 20 && consumoMensual <= 28) {
            porcentaje = 0.25;
        }

        double nuevoValor = valorActual + (valorActual * porcentaje);

        System.out.println("El nuevo valor a pagar es: $" + nuevoValor);
    }
}
