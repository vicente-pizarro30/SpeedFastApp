public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido) {
        super(idPedido);
    }

    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Tiempo de entrega (Encomienda): 24 a 48 horas hábiles.");
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Furgón de Reparto";
        this.historial.add("Furgón asignado automáticamente.");
        System.out.println("Asignación automática: Furgón para el pedido #" + idPedido);
    }
}