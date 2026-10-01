public class fashion {
    static void main(String[] args) {
        String genero = Reutilizacion.ingresarTexto("Cliente, ingrese su genero: ");
        double presupuesto = Reutilizacion.ingresarRealD("Clinete, ingrese su presupuesto: ");
        String estacionFav = Reutilizacion.ingresarTexto("Cliente, cual es su estacion favorita? verano o invierno? ");
        String desicion = recomendacion(genero, presupuesto, estacionFav);
        generarMensaje(desicion);
    }
    public static String recomendacion(String genero, double presupuesto, String desicion) {
        String mensaje ="";
        if (genero.equalsIgnoreCase ("mujer") && presupuesto > 150000 && desicion.equalsIgnoreCase("verano")){
            mensaje = "Vestidos y ropa ligera, adecuada para primavera o el verano";
        }else {
            mensaje= "Chaqueta y prendas de abrigo adecuadas para el otoño y el invierno";
        }
        return mensaje;
    }
    public static void generarMensaje(String desicion){
        String mensaje = "Querido cliente, las mejores prendas de ropa para usted son: " + desicion;
        System.out.println(mensaje);
    }
}

/*    static void main(String[] args) {
        String genero = Reutilizacion.ingresarTexto("Cliente, ingrese su genero: ");
        double presupuesto = Reutilizacion.ingresarRealD("Clinete, ingrese su presupuesto: ");
        String estacionFav = Reutilizacion.ingresarTexto("Cliente, cual es su estacion favorita? verano o invierno? ");
        String desicion = recomendacion(genero, presupuesto, estacionFav);
        generarMensaje(desicion);
    }
    public static String recomendacion(String genero, double presupuesto, String desicion) {
        String mensaje ="";
        if (genero.equalsIgnoreCase ("mujer") && presupuesto > 150000 && desicion.equalsIgnoreCase("verano")){
            mensaje = "Vestidos y ropa ligera, adecuada para primavera o el verano";
        }
        if (genero.equalsIgnoreCase ("hombre") && presupuesto > 200000 && desicion.equalsIgnoreCase("invierno")){
            mensaje= "Chaqueta y prendas de abrigo adecuadas para el otoño y el invierno";
        }
        return mensaje;
    }
    public static void generarMensaje(String desicion){
        String mensaje = "Querido cliente, las mejores prendas de ropa para usted son: " + desicion;
        System.out.println(mensaje);*/

fashion.java