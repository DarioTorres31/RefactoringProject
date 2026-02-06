import java.util.ArrayList;

public class Pedido {
    private static final double DESCUENTO = 0.95;
    private static final double IVA = 0.21;
    
    private Cliente cliente;
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Pedido (Cliente cliente){
        this.cliente = cliente;
    }

    

    public void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }
    
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }
    
    public double calcularSubTotal(){
        
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

    public double calcularDescuento(){
        boolean correcto = false;
        double subTotal = 0;
        calcularSubTotal();
        descuentoAplicado();
        if (correcto = true){
            subTotal = subTotal * DESCUENTO;
        }
        return subTotal;
    }

    public boolean descuentoAplicado(){
        double subTotal = 0;
        boolean correcto = false;
        if (subTotal > 3000){
            correcto = true;
        }
        return correcto;
    }
    
    public double getTotalConIva(double total) {
        double totalConIva = total + (total * DESCUENTO);
        return totalConIva;
    }
}
