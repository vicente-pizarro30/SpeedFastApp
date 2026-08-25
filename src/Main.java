public class Main {
    public static void main(String[] args) {
        System.out.println("=== SPEEDFAST - CÁLCULO DE TIEMPOS DE ENTREGA ===\n");

        // Polimorfismo: Referencias de tipo Pedido instanciando las subclases
        Pedido pedidoComida = new PedidoComida(201, "Av. Los Leones 123", 4.0);
        Pedido pedidoEncomienda = new PedidoEncomienda(202, "Calle Las Flores 456", 8.5);
        Pedido pedidoExpress = new PedidoExpress(203, "Pasaje El Sol 789", 6.0);

        Pedido[] listaPedidos = {pedidoComida, pedidoEncomienda, pedidoExpress};

        for (Pedido p : listaPedidos) {
            p.mostrarResumen();
            System.out.println("Tiempo estimado de entrega: " + p.calcularTiempoEntrega() + " minutos.");
            System.out.println("------------------------------------------------------------------");
        }
    }
}