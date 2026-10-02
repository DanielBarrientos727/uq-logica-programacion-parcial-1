public class PruebaMats {

    public static void main(String[] args) {
        String grado = Reutilizacion.ingresarTexto("Ingrese el grado escolar del estudiante (primaria, intermedio, secundaria): ");
        double notaHabilidad = Reutilizacion.ingresarRealD("Ingrese la habilidad matemática del estudiante (1 a 5): ");

        String clasificacion = decidirClasificacion(grado, notaHabilidad);
        generarMensaje(clasificacion);
    }

    public static String decidirClasificacion(String grado, double notaHabilidad) {
        String mensaje = "";

        if (grado.equalsIgnoreCase("primaria")) {
            if (notaHabilidad >= 3) {
                mensaje = " pertenece al Grupo A";
            } else {
                mensaje = " pertenece al Grupo B";
            }
        } else if (grado.equalsIgnoreCase("intermedio")) {
            if (notaHabilidad >= 4) {
                mensaje = " pertenece al Grupo A";
            } else {
                mensaje = " pertenece al Grupo B";
            }
        } else if (grado.equalsIgnoreCase("secundaria")) {
            if (notaHabilidad == 5) {
                mensaje = " pertenece al Grupo A";
            } else {
                mensaje = " pertenece al Grupo B";
            }
        } else {
            mensaje = " no es clasificado para esta competencia";
        }

        return mensaje;
    }

    public static void generarMensaje(String clasificacion) {
        String mensaje = "Profesor, su estudiante" + clasificacion;
        System.out.println(mensaje);
    }
}