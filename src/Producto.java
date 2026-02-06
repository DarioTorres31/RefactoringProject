
public class Producto {

    private String nombre;
    private double precio;

    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }


    // ArrayList<Producto> precioProducto = new ArrayList<>();

    // precioProducto.add(getPrecioProducto());
    
    public String getNombreProducto() {
        return nombre;
    }

    public double getPrecioProducto() {
        return precio;
    }

}
