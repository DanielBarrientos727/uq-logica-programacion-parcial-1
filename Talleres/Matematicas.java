public class Matematicas {

    public static void main(String[] args) {
        int numero = Reutilizacion.ingresarEntero("Por favor, ingrese un número entero: ");
        String clasificacion = calcularNumero(numero);
        generarMensaje(clasificacion);
    }

    public static String calcularNumero(int numero) {
        String num = "";

        if (numero > 0 && numero > 100) {
            num = "positivo y mayor a 100";
        } else if (numero > 0 && numero <= 100) {
            num = "positivo y no es mayor que 100";
        } else if (numero < 0) {
            num = "negativo";
        } else {
            num = "igual a 0";
        }

        return num;
    }

    public static void generarMensaje(String clasificacion) {
        String mensaje = "Querido estudiante, el número es: " + clasificacion;
        System.out.println(mensaje);
    }
}
