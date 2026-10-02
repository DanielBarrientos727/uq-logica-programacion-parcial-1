public class Matematicas {

    public static void main(String[] args) {
        int numeroIngresado = Reutilizacion.ingresarEntero("Por favor ingresar el número: ");
        String clasificacion = calcularNum(numeroIngresado);
        generarMensaje(clasificacion);
    }

    public static String calcularNum(int numero) {
        String descripcion = "";

        if (numero > 0) {
            if (numero > 100) {
                descripcion = " positivo y mayor a 100";
            } else {
                descripcion = " positivo y no es mayor que 100";
            }
        } else if (numero < 0) {
            descripcion = " negativo";
        } else {
            descripcion = " igual a 0";
        }

        return descripcion;
    }

    public static void generarMensaje(String clasificacion) {
        String mensaje = "Querido estudiante, el número es:" + clasificacion;
        System.out.println(mensaje);
    }
}