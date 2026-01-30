import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaPedidos {
    // Variables globales mal ubicadas y poco descriptivas
    private static final double TASA_IVA = 0.21; // Esto es el IVA

    // Clase cliente
    public void Cliente(String nombre, String codigo, String direccion) {
        
    }

    public void getNombre(){
        
    }

    public void pedido(){
        Pedido pedido = new Pedido("");
    }
    public void Producto(String nombre, Double precio){
        
    }


    public static void main(String[] args) {

        System.out.println("INICIANDO SISTEMA DE PEDIDOS v1.0...");

        // --- CLIENTE 1: Lista de productos (Arrays paralelos, mala práctica) ---
        ArrayList<String> NombreProducto = new ArrayList<>(); // Nombres productos
        NombreProducto.add("Servidor Dell PowerEdge");
        NombreProducto.add("Licencia Windows Server");
        NombreProducto.add("Cableado Estructurado");

        ArrayList<Double> precioProducto = new ArrayList<>(); // Precios productos
        precioProducto.add(2500.00);
        precioProducto.add(800.00);
        precioProducto.add(250.50);

        // --- CLIENTE 1: CÁLCULOS (Mezclados con impresión) ---
        //System.out.println(String.format("El cliente%s con ID %d debe %.2f euros.", nombre, id, total));
        double total = 0; // total
        System.out.println(String.format("Procesando pedido para: %s", Cliente.getNombre()));
        System.out.println(String.format("ID Cliente: " + Cliente.get
        ID() , "%s"));

        for (int i = 0; i < NombreProducto.size(); i++) {
            total = total + precioProducto.get(i);
            System.out.println(String.format("Item " + (i+1) + ": " + NombreProducto.get(i) + " - " + precioProducto.get(i) + " EUR"));
        }
        // Lógica de descuento "hardcodeada"
        if (total > 3000) {
            System.out.println("Aplica descuento por gran volumen (5%)");
            total = total * 0.95;
        }

        // Calcula el total más iva
        double totalConIva = getTotalConIva(total);

        // --- CLIENTE 1: GUARDADO EN ARCHIVO (Responsabilidad mezclada) ---
        try {
            FileWriter myWriter = new FileWriter("pedido_" + cliente.getID()+ ".txt");
            myWriter.write("FACTURA\n");
            myWriter.write("Cliente: " + cliente.getNombre() + "\n");
            myWriter.write("Direccion: " + cliente.getDireccion() + "\n");
            myWriter.write("Total a pagar: " + totalConIva + "\n");
            myWriter.close();
            System.out.println("Archivo guardado correctamente.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // ====================================================================
        // --- CLIENTE 2: COPY-PASTE DEL CÓDIGO ANTERIOR (El horror) ---
        // ====================================================================

        String c2_n = "Libreria Moderna";
        String c2_id = "A98765432";
        String c2_d = "Av. Diagonal 200, Barcelona";

        ArrayList<String> p_n2 = new ArrayList<>();
        p_n2.add("Pack Libros Escolares");
        p_n2.add("Estantería Metálica");

        ArrayList<Double> p_p2 = new ArrayList<>();
        p_p2.add(1200.00);
        p_p2.add(300.00);
        double t2 = 0;
        System.out.println("Procesando pedido para: " + c2_n);
        System.out.println("ID Cliente: " + c2_id);

        for (int i = 0; i < p_n2.size(); i++) {
            t2 = t2 + p_p2.get(i);
            System.out.println("Item " + (i+1) + ": " + p_n2.get(i) + " - " +
            p_p2.get(i) + " EUR");
        }

        // Lógica de descuento repetida (y si cambiamos una, la otra se queda
        //desactualizada)


        /*

        if (t2 > 3000) {
            System.out.println("Aplica descuento por gran volumen (5%)");
            t2 = t2 * 0.95;

        }

        double t2_iva = t2 + (t2 * TASA_IVA);
        System.out.println("Total Neto: " + t2);
        System.out.println("Total con IVA (" + (TASA_IVA*100) + "%): " + t2_iva);
        System.out.println("--------------------------------------------------");
        try {
            FileWriter myWriter = new FileWriter("pedido_" + c2_id + ".txt");
            myWriter.write("FACTURA\n");
            myWriter.write("Cliente: " + c2_n + "\n");
            myWriter.write("Direccion: " + c2_d + "\n");
            myWriter.write("Total a pagar: " + t2_iva + "\n");
            myWriter.close();
            System.out.println("Archivo guardado correctamente.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        */
    }

    private static double getTotalConIva(double total) {
        double totalConIva = total + (total * TASA_IVA);
        System.out.println("Total Neto: " + total);
        System.out.println("Total con IVA (" + (TASA_IVA*100) + "%): " + totalConIva);
        System.out.println("--------------------------------------------------");
        return totalConIva;
    }
}