import java.util.ArrayList;

public abstract class Pedido implements Despachable, Cancelable, Rastreable {
    // Atributos comunes a todos los pedidos
    protected int idPedido;
    protected String estado; // Puede ser: Pendiente, Despachado, Cancelado
    protected String repartidor;
    protected ArrayList<String> historial; // Para guardar el rastro de los eventos

    // Constructor
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.estado = "Pendiente";
        this.repartidor = "Sin asignar";
        this.historial = new ArrayList<>();
        this.historial.add("Pedido #" + idPedido + " creado.");
    }

    // Método común implementado (Abstracción)
    public void mostrarResumen() {
        System.out.println("--- Resumen del Pedido #" + idPedido + " ---");
        System.out.println("Estado actual: " + estado);
        System.out.println("Repartidor: " + repartidor);
    }

    // Método abstracto: cada subclase tendrá que escribir su propia versión
    public abstract void calcularTiempoEntrega();

    // Método que será SOBRESCRITO en las subclases (Polimorfismo)
    public abstract void asignarRepartidor();

    // Método SOBRECARGADO (Polimorfismo: mismo nombre, diferentes parámetros)
    public void asignarRepartidor(String nombre) {
        this.repartidor = nombre;
        this.historial.add("Repartidor asignado manualmente: " + nombre);
        System.out.println("Se ha asignado a " + nombre + " manualmente al pedido #" + idPedido);
    }

    // --- Implementación de Interfaces ---

    @Override
    public void despachar() {
        if (!estado.equals("Cancelado")) {
            this.estado = "Despachado";
            this.historial.add("El pedido ha sido despachado.");
            System.out.println("Pedido #" + idPedido + " despachado con éxito.");
        } else {
            System.out.println("Error: No se puede despachar un pedido que está cancelado.");
        }
    }

    @Override
    public void cancelar() {
        this.estado = "Cancelado";
        this.historial.add("El pedido fue cancelado.");
        System.out.println("Pedido #" + idPedido + " cancelado.");
    }

    @Override
    public void verHistorial() {
        System.out.println("Historial del Pedido #" + idPedido + ":");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println("- " + historial.get(i));
        }
    }
}