import java.util.ArrayList;

public class Pedido {
    private static final double DESCUENTO = 0.95;
    private static final double IVA = 0.21;
    
    private static Cliente cliente;
    private static ArrayList<Producto> listaProductos = new ArrayList<>();
    public static boolean correcto;

    public Pedido (Cliente cliente){
        this.cliente = cliente;
    }

    public static Cliente getCliente(){
        return cliente;
    }

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }

    public static double getIva(){
        return IVA;
    }
    
    public static double calcularSubTotal(){
        
        double subTotal = 0;

        /*
            for (int i = 0; i < listaProductos.size(); i++) {
            SubTotal = SubTotal+ listaProductos.get(i).getPrecioProducto();
        }
        */

        for(Producto producto : listaProductos) {
            subTotal = subTotal + producto.getPrecioProducto();
        }
        return subTotal;
    }

    public static double calcularDescuento(){
        double subtotal = calcularSubTotal();

        subtotal = subtotal * DESCUENTO; 

        return subtotal;
    }

    public static boolean descuentoAplicado(){
        double subtotal = calcularDescuento();

        if (subtotal > 3000){
            return true;
        }else{
            return false;
        } 
    }
    
    public static double getTotalConIva(double total) {
        double subtotal = calcularSubTotal();

        subtotal = subtotal + (subtotal * IVA);

        return subtotal;
    }

}
