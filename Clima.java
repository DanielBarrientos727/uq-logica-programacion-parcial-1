public class Clima {

    public static void main(String[] args) {
        double temperatura = Reutilizacion.ingresarRealD("Por favor ingrese la temperatura actual en grados Celsius: ");
        String estadoCielo = Reutilizacion.ingresarTexto("Por favor ingresar el estado del cielo (soleado, nublado, lluvioso): ");

        String condicion = tomarDecision(temperatura, estadoCielo);
        generarMensaje(condicion);
    }

    public static String tomarDecision(double temperatura, String estadoCielo) {
        String mensaje = "";

        if (temperatura > 30 && estadoCielo.equalsIgnoreCase("soleado")) {
            mensaje = " caluroso y soleado";
        } else if (temperatura < 10 && (estadoCielo.equalsIgnoreCase("nublado") || estadoCielo.equalsIgnoreCase("lluvioso"))) {
            mensaje = " frío y nublado/lluvioso";
        } else if (temperatura >= 10 && temperatura <= 30 && estadoCielo.equalsIgnoreCase("soleado")) {
            mensaje = " agradable y soleado";
        } else {
            mensaje = " clima variable";
        }

        return mensaje;
    }

    public static void generarMensaje(String condicion) {
        String mensaje = "Querido usuario, el clima actual es:" + condicion;
        System.out.println(mensaje);
    }
}