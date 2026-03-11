import java.util.Random;

public class PruebaRendimiento {

    public static void main(String[] args) {

        int[] tamaños = {1, 100, 1000, 10000, 100000};

        Random random = new Random();

        for (int n : tamaños) {

            PlatarfomaVentas plataforma = new PlatarfomaVentas();

            Runtime runtime = Runtime.getRuntime();
            runtime.gc(); 

            long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

            long inicio = System.nanoTime();

            for (int i = 0; i < n; i++) {

                Categoria categoria =
                        Categoria.values()[random.nextInt(Categoria.values().length)];

                Producto producto = new Producto(
                        "COD" + i,
                        random.nextDouble(1000),
                        categoria,
                        "Producto" + i
                );

                plataforma.insertarProducto(producto);
            }

            long fin = System.nanoTime();

            long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

            long tiempo = fin - inicio;
            long memoriaUsada = memoriaDespues - memoriaAntes;

            System.out.println("Cantidad productos: " + n);
            System.out.println("Tiempo ejecución: " + (tiempo / 1_000_000) + " ms");
            System.out.println("Memoria usada: " + (memoriaUsada / 1024) + " KB");
            System.out.println("--------------------------------");
        }
    }
}