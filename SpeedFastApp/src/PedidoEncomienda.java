public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Encomienda");
    }

    // SOBREESCRITURA (Override)
    @Override
    public void asignarRepartidor() {
        System.out.println("-> Pedido #" + idPedido + " [ENCOMIENDA]: Buscando repartidor. Requisito: Validar capacidad de peso y cuidado de embalaje.");
    }

    // SOBRECARGA (Overload)
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("-> Pedido #" + idPedido + " [ENCOMIENDA]: El repartidor " + nombreRepartidor + " ha sido asignado. Validación: Peso y embalaje aprobados para la moto.");
    }
}