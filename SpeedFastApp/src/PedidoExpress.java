public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Compra Express");
    }

    // SOBREESCRITURA (Override)
    @Override
    public void asignarRepartidor() {
        System.out.println("-> Pedido #" + idPedido + " [EXPRESS]: Escaneando GPS para asignar al repartidor más cercano con disponibilidad inmediata.");
    }

    // SOBRECARGA (Overload)
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("-> Pedido #" + idPedido + " [EXPRESS]: El repartidor " + nombreRepartidor + " estaba a 2 minutos. Asignación inmediata completada.");
    }
}