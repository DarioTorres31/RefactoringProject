import java.io.FileWriter;
import java.io.IOException;

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

        Pedido pedido2 = new Pedido(cliente2);

        pedido2.agregarProducto(new Producto("Pack Libros Escolares", 1200.00));
        pedido2.agregarProducto(new Producto("Estantería Metálica", 300));

        procesarPedido(pedido2);
    }

    private static void procesarPedido(Pedido pedido){
        imprimirPedido(pedido);
        generarFicheroPedido(pedido);
    }

    private static void imprimirPedido(Pedido pedido){
        System.out.println( "INICIANDO SISTEMA DE PEDIDOS v1.0..."); 
        System.out.println(String.format("Procesando pedido para: %s ", Cliente.getNombre()));
        System.out.println(String.format("ID Cliente: %s", Cliente.getId()));
        for(int i = 0; i < pedido.getListaProductos().size(); i++){
            System.out.println(String.format("Item %d : %s - %.2f EUR", (i+1), pedido.getListaProductos().get(i).getNombreProducto(), pedido.getListaProductos().get(i).getPrecioProducto()));
        }
        if(Pedido.descuentoAplicado()){
            System.out.println("Aplica descuento por gran volumen (5%)");
        }
        System.out.println(String.format(  "Total Neto: %f", Pedido.calcularSubTotal()));
        System.out.println(String.format("Total con IVA (%.2f %%): %.2f", (TASA_IVA * 100), pedido.getTotalConIva(0)));
        System.out.println("--------------------------------------------------");
    }

    private static void generarFicheroPedido(Pedido pedido){
        try {
            FileWriter myWriter = new FileWriter(String.format("pedido_%s.txt", pedido.getCliente().getId()));
            myWriter.write("FACTURA\n");
            myWriter.write(String.format("Cliente: %s \n", pedido.getCliente().getNombre() ));
            myWriter.write(String.format("Direccion: %s \n", pedido.getCliente().getDireccion()));
            myWriter.write(String.format("Total a pagar: %.2f\n ", pedido.calcularSubTotal()));
            myWriter.close();
            System.out.println("Archivo guardado correctamente.");
            } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
