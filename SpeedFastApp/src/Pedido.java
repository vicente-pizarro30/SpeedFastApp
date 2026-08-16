public class Pedido {
    // Usamos protected para que las clases hijas puedan acceder a ellos
    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    // Constructor de la clase base
    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    // Método genérico que luego vamos a "sobreescribir" en las clases hijas
    public void asignarRepartidor() {
        System.out.println("Asignando un repartidor genérico para el pedido #" + idPedido + " con destino a " + direccionEntrega);
    }
}