public class FashionTrends {

    public static void main(String[] args) {
        String genero = Reutilizacion.ingresarTexto("Ingrese el género del cliente (Femenino/Masculino): ");
        double presupuesto = Reutilizacion.ingresarRealD("Ingrese el presupuesto en pesos: ");
        String estacion = Reutilizacion.ingresarTexto("Ingrese la estación favorita (verano, invierno, etc.): ");

        String recomendacion = recomendarRopa(genero, presupuesto, estacion);
        generarMensaje(recomendacion);
    }

    public static String recomendarRopa(String genero, double presupuesto, String estacion) {
        String sugerencia = "";

        if (genero.equalsIgnoreCase("Femenino")) {
            if (presupuesto > 150000 && estacion.equalsIgnoreCase("verano")) {
                sugerencia = "Vestidos y ropa ligera adecuada para la primavera o el verano.";
            } else {
                sugerencia = "No hay una sugerencia específica para las condiciones ingresadas.";
            }
        } else if (genero.equalsIgnoreCase("Masculino")) {
            if (presupuesto > 200000 && estacion.equalsIgnoreCase("invierno")) {
                sugerencia = "Chaquetas y prendas de abrigo adecuadas para el otoño o el invierno.";
            } else {
                sugerencia = "No hay una sugerencia específica para las condiciones ingresadas.";
            }
        } else {
            sugerencia = "Sin recomendación especial.";
        }

        return sugerencia;
    }

    public static void generarMensaje(String recomendacion) {
        String mensaje = "Sugerencia de Ropa: " + recomendacion;
        System.out.println(mensaje);
    }
}