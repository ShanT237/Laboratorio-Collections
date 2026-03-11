public class Producto {
    private String codigo;
    private double precio;
    private Categoria categoria;
    private String nombre;

    public Producto(String codigo, double precio, Categoria categoria, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "coidgo='" + codigo + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
