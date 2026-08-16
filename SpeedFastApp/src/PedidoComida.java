public class PedidoComida extends Pedido {

    // Constructor que le pasa los datos a la clase padre (Pedido)
    public PedidoComida(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega, "Comida");
    }

    // SOBREESCRITURA: Cambiamos el comportamiento del método original (sin parámetros)
    @Override
    public void asignarRepartidor() {
        System.out.println("-> Pedido #" + idPedido + " [COMIDA]: Buscando repartidor. Requisito: Debe tener mochila térmica.");
    }

    // SOBRECARGA: Mismo nombre del método, pero ahora recibe un parámetro (nombreRepartidor)
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("-> Pedido #" + idPedido + " [COMIDA]: El repartidor " + nombreRepartidor + " ha sido asignado. Validación: Mochila térmica confirmada.");
    }
}