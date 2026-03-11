import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class PlatarfomaVentas {
    HashMap<String, Producto> mapProductos = new HashMap<>();
    TreeSet<Producto> productosPrecio =
            new TreeSet<>(Comparator
                    .comparing(Producto::getPrecio)
                    .thenComparing(Producto::getCodigo));

    public void insertarProducto(Producto producto) {

        mapProductos.put(producto.getCodigo(), producto);
        productosPrecio.add(producto);

    }

    public Producto buscarProducto(String codigo){
        return mapProductos.get(codigo);
    }

    public void mostrarOrdenados(){
        for (Producto producto : productosPrecio){
            System.out.println(producto);
        }
    }

    public void filtrarPorCategoria(Categoria categoria){

        for (Producto p : mapProductos.values()) {

            if (p.getCategoria() == categoria) {
                System.out.println(p);
            }

        }

    }
}
