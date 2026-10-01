public class EmpresaAgua {

    public static void main(String[] args) {
        double consumo = Reutilizacion.ingresarRealD("Por favor, ingrese el consumo mensual de agua en metros cúbicos: ");
        double valor = Reutilizacion.ingresarRealD("Por favor, ingrese cuánto vale el metro cúbico de agua: ");
        
        double valorFactura = sumaTotal(consumo, valor);
        double valorFinal = calcularDecision(consumo, valorFactura);
        
        generarMensaje(valorFactura, valorFinal);
    }

    public static double sumaTotal(double consumo, double valor) {
        return valor * consumo;
    }

    public static double calcularDecision(double consumo, double valorFactura) {
        double valor = 0.0;

        if (consumo >= 1 && consumo <= 9) {
            valor = valorFactura + (valorFactura * 0.15);
        } else if (consumo >= 13 && consumo <= 15) {
            valor = valorFactura + (valorFactura * 0.15);
        } else if (consumo >= 20 && consumo <= 28) {
            valor = valorFactura + (valorFactura * 0.25);
        } else {
            valor = valorFactura;
        }

        return valor;
    }

    public static void generarMensaje(double valorFactura, double valorFinal) {
        String mensaje = "Estimado usuario, el valor inicial de su factura era: $" + valorFactura +
                "\nSin embargo, debido a su consumo, su nuevo valor a pagar es: $" + valorFinal;
        System.out.println(mensaje);
    }
}
