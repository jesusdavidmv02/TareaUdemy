package OrdendeCompra;

public class Cliente {

    private String name ;
    private String apellido ;

    public Cliente(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Cliente{" + "name='" + name + '\'' + ", apellido='" + apellido + '\'' + '}';
    }
}
