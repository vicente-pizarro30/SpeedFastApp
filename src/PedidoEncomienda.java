public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int calcularTiempoEntrega() {
        // 20 min base + 1.5 min por kilómetro (ajustado a entero con Math.round)
        return (int) Math.round(20 + (1.5 * distanciaKm));
    }
}