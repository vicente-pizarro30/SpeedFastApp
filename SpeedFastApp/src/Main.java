public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA SPEEDFAST ===");
        System.out.println("Iniciando asignación de pedidos...\n");

        // 1. Instanciar un objeto de cada subclase
        PedidoComida hamburguesa = new PedidoComida(101, "Avenida Los Leones 123");
        PedidoEncomienda documentos = new PedidoEncomienda(102, "Calle Las Flores 456");
        PedidoExpress remedios = new PedidoExpress(103, "Pasaje El Sol 789");

        // 2. Probar el método SOBREESCRITO (sin parámetros)
        System.out.println("--- BÚSQUEDA DE REPARTIDORES (MÉTODO SOBREESCRITO) ---");
        hamburguesa.asignarRepartidor();
        documentos.asignarRepartidor();
        remedios.asignarRepartidor();

        System.out.println("\n--- ASIGNACIÓN CONFIRMADA (MÉTODO SOBRECARGADO) ---");

        // 3. Probar el método SOBRECARGADO (pasando el nombre del repartidor)
        hamburguesa.asignarRepartidor("Carlos");
        documentos.asignarRepartidor("Ana");
        remedios.asignarRepartidor("Felipe");
    }
}