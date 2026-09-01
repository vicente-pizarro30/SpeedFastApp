public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido) {
        super(idPedido);
    }

    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Tiempo de entrega (Comida): 30 a 45 minutos.");
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor en Moto";
        this.historial.add("Repartidor en moto asignado automáticamente.");
        System.out.println("Asignación automática: Moto para el pedido #" + idPedido);
    }
}