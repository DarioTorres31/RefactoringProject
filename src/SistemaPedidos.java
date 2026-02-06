import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaPedidos {
    public static void main(String[] args) {

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

}