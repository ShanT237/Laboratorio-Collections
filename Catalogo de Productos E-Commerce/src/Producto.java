public class Producto implements Comparable<Producto>{

    private String codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Producto(String codigo, String nombre, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Producto o) {
        return Double.compare(this.precio, o.precio);
    }

    public String toString(){
        return codigo + " " + nombre + " $" + precio;
    }
}