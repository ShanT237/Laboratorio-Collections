import java.util.*;

public class SistemaCatalogo {

    private HashMap<String, Producto> mapa = new HashMap<>();
    private TreeSet<Producto> ordenPrecio = new TreeSet<>();

    public void agregarProducto(Producto p){

        mapa.put(p.getCodigo(), p);
        ordenPrecio.add(p);

    }

    public Producto buscar(String codigo){
        return mapa.get(codigo);
    }

    public void mostrarOrdenPrecio(){

        for(Producto p : ordenPrecio){
            System.out.println(p);
        }

    }

}