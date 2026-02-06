public class App {

    private static final double TASA_IVA = 0.21;
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Techsolutions SL", "48938", "Calle valencia");

        Pedido pedido = new Pedido(cliente1);

        pedido.agregarProducto(new Producto("Server Dell Powershell", 800));
        pedido.agregarProducto(new Producto("Licencia Windows Server", 300));
        pedido.agregarProducto(new Producto("Cableado Estructurado", 250.50));

        Cliente cliente2 = new Cliente("Libreria Moderna", "A98765432", "Av. Diagonal 200, Barcelona");

        private static void procesarPedido(Pedido pedido){
            imprimirPedido(pedido1);
            generarFicheroPedido(pedido);
        }

        private static void imprimirPedido(Pedido pedido){
            System.out.println(String.format("INICIANDO SISTEMA DE PEDIDOS v1.0...", "%s")); 
            System.out.println(String.format("Procesando pedido para: %s", Cliente.getNombre(), "%s"));
            System.out.println(String.format("ID Cliente: " + Cliente.getID() , "%s"));
            for(int i = 0; i < pedido.getlistaProductos().size(); i++){

            }

        }

    }
}
