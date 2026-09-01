import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BIENVENIDO AL SISTEMA SPEEDFAST ===");

        // Creamos una lista para simular nuestra base de datos de pedidos
        ArrayList<Pedido> listaPedidos = new ArrayList<>();

        // Creamos los objetos (Instanciamos)
        Pedido pedido1 = new PedidoComida(101);
        Pedido pedido2 = new PedidoEncomienda(102);
        Pedido pedido3 = new PedidoExpress(103);

        listaPedidos.add(pedido1);
        listaPedidos.add(pedido2);
        listaPedidos.add(pedido3);

        System.out.println("\n--- SIMULANDO ASIGNACIONES Y TIEMPOS ---");
        // Asignación automática (Método sobrescrito)
        pedido1.asignarRepartidor();
        pedido1.calcularTiempoEntrega();

        // Asignación manual (Método sobrecargado)
        pedido2.asignarRepartidor("Juan Pérez");
        pedido2.calcularTiempoEntrega();

        // Asignación automática
        pedido3.asignarRepartidor();
        pedido3.calcularTiempoEntrega();

        System.out.println("\n--- SIMULANDO DESPACHOS Y CANCELACIONES ---");
        pedido1.despachar();

        // Cancelamos el pedido 2 y luego intentamos despacharlo para ver qué pasa
        pedido2.cancelar();
        pedido2.despachar();

        pedido3.despachar();

        System.out.println("\n--- RESUMEN E HISTORIAL DE ENTREGAS ---");
        // Recorremos la lista para ver el estado final y el historial usando un for clásico
        for (int i = 0; i < listaPedidos.size(); i++) {
            Pedido p = listaPedidos.get(i);
            p.mostrarResumen();
            p.verHistorial();
            System.out.println(); // Salto de línea estético
        }
    }
}