package OrdendeCompra;

public class Producto {

    private  String fabricante ;
    private  String nombreProductos;
    private  int precio ;

    public Producto(String fabricante, String nombreProductos, int precio) {
        this.fabricante = fabricante;
        this.nombreProductos = nombreProductos;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombreProductos() {
        return nombreProductos;
    }

    public int getPrecio() {
        return precio;
    }
}
