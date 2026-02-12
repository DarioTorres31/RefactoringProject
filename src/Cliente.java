public class Cliente {

    private static String nombre;
    private static String id;
    private static String direccion;
    
    public Cliente (String nombre, String id, String direccion){
        Cliente.nombre = nombre;
        Cliente.id = id;
        Cliente.direccion = direccion;
        }
    
    public static String getNombre() {
        return nombre;
    }

    public static String getId() {
        return id;
    }

    public static String getDireccion() {
        return direccion;
    }

}
