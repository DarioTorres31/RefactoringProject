public class App {

    private static final double TASA_IVA = 0.21;
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Techsolutions SL", "48938", "Calle valencia");

        Pedido pedido1 = new Pedido(cliente1);

        pedido1.agregarProducto(new Producto("Server Dell Powershell", 800));
        pedido1.agregarProducto(new Producto("Licencia Windows Server", 300));
        pedido1.agregarProducto(new Producto("Cableado Estructurado", 250.50));

        procesarPedido(pedido1);

        Cliente cliente2 = new Cliente("Libreria Moderna", "A98765432", "Av. Diagonal 200, Barcelona");

    }

    private static void procesarPedido(Pedido pedido){
        imprimirPedido(pedido);
        generarFicheroPedido(pedido);
    }

    private static void imprimirPedido(Pedido pedido){
        System.out.println(String.format("INICIANDO SISTEMA DE PEDIDOS v1.0...", "%s")); 
        System.out.println(String.format("Procesando pedido para: %s", Cliente.getNombre(), "%s"));
        System.out.println(String.format("ID Cliente: " + Cliente.getID() , "%s"));
        for(int i = 0; i < pedido.getListaProductos().size(); i++){

        }

    }

    private static void generarFicheroPedido(Pedido pedido){

    }
}
