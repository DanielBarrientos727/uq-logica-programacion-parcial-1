public class Mercadona {

    public static void main(String[] args) {
        int cantidadProductos = Reutilizacion.ingresarEntero("Cliente, por favor ingresar la cantidad de productos comprados: ");
        double valorCompra = Reutilizacion.ingresarRealD("Cliente, por favor ingresar el valor total de su compra: ");
        
        double totalAPagar = calcularDescuento(cantidadProductos, valorCompra);
        generarMensaje(totalAPagar);
    }

    public static double calcularDescuento(int cantidadProductos, double valorCompra) {
        double valorFinal = 0.0;

        if (cantidadProductos >= 5 && valorCompra > 50000) {
            valorFinal = valorCompra - (valorCompra * 0.10);
        } else if (cantidadProductos >= 3 && valorCompra > 30000) {
            valorFinal = valorCompra - (valorCompra * 0.05);
        } else {
            valorFinal = valorCompra;
        }

        return valorFinal;
    }

    public static void generarMensaje(double totalAPagar) {
        String mensaje = "Querido cliente, el valor final de su factura es: $" + totalAPagar;
        System.out.println(mensaje);
    }
}