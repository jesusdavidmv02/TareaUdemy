package OrdendeCompra;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OrdenCompra orden;

        System.out.println( "Digite la descpricion ");
        orden = new OrdenCompra( sc.nextLine());

        System.out.println("digite nombre y apellido de cliente");
        orden.setClientes(new Cliente(sc.nextLine(),sc.nextLine()));

        orden.setFecha(new Date());

        for (int i = 0; i < 4 ; i++) {

            System.out.println("______________________________________");
            System.out.println("######  producto Numero  "+ i + " ########### ");
            System.out.println("_______________________________________");


            System.out.println("nombre de le fabicante");
            String nombrefabricante = sc.nextLine();

            System.out.println("Nombre de producto");
            String nombreproducto = sc.nextLine();

            System.out.println("digite el Precio de producto ");
            int precioproducto  = Integer.parseInt(sc.nextLine());

            orden.addProducto(new Producto(nombrefabricante, nombreproducto , precioproducto));
            System.out.println("sus producto fuero agregado satifatoriamente ");

        }

        OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
        orden1.setClientes(new Cliente("Andres", "Guzman"));

        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital", "Unidad SSD 480GB", 54890));
        orden1.addProducto(new Producto("MSI", "Monitor Optix G271", 363940));
        orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setClientes(new Cliente("John", "Doe"));

        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Fensa", "Cocina", 239990));
        orden2.addProducto(new Producto("Samsung", "Refrigerador", 429990));
        orden2.addProducto(new Producto("Midea", "Lavadora", 149990));
        orden2.addProducto(new Producto("Aspiradora", "IRobot", 199990));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setClientes(new Cliente("Pepa", "Roe"));

        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Melon", "Cemento 25kg", 4870));
        orden3.addProducto(new Producto("Grau", "Hormigon", 6040));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 48990));

        OrdenCompra[] ordenes = {orden, orden1, orden2, orden3};

        for (OrdenCompra ordeni : ordenes) {

            System.out.println("---------------------------------- // --------------------------------------");

            System.out.println("Folio: " + ordeni.getIdentificador());
            System.out.println("Cliente: " + ordeni.getClientes());
            System.out.println("Descripcion: " + ordeni.getDescripcion());
            System.out.println("Fecha: " + ordeni.getFecha());
            System.out.println("Total: " + ordeni.getGranTotal());

            int i = 1;
            for (Producto p : ordeni.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombreProductos() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}
