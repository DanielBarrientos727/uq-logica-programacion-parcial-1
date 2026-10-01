public class Fashion {

    public static void main(String[] args) {
        String genero = Reutilizacion.ingresarTexto("Cliente, ingrese su género: ");
        double presupuesto = Reutilizacion.ingresarRealD("Cliente, ingrese su presupuesto: ");
        String estacionFav = Reutilizacion.ingresarTexto("Cliente, ¿cuál es su estación favorita? ¿verano o invierno? ");
        
        String recomendacionVestuario = recomendar(genero, presupuesto, estacionFav);
        generarMensaje(recomendacionVestuario);
    }

    public static String recomendar(String genero, double presupuesto, String estacion) {
        String mensaje = "";

        if (genero.equalsIgnoreCase("mujer") && presupuesto > 150000 && estacion.equalsIgnoreCase("verano")) {
            mensaje = "Vestidos y ropa ligera, adecuada para primavera o el verano.";
        } else {
            mensaje = "Chaqueta y prendas de abrigo adecuadas para el otoño y el invierno.";
        }

        return mensaje;
    }

    public static void generarMensaje(String recomendacion) {
        String mensaje = "Querido cliente, las mejores prendas de ropa para usted son: " + recomendacion;
        System.out.println(mensaje);
    }
}
