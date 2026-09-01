public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido) {
        super(idPedido);
    }

    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Tiempo de entrega (Express): Menos de 2 horas.");
    }

    @Override
    public void asignarRepartidor() {
        this.repartidor = "Repartidor en Bicicleta";
        this.historial.add("Ciclista asignado automáticamente.");
        System.out.println("Asignación automática: Ciclista para el pedido #" + idPedido);
    }
}