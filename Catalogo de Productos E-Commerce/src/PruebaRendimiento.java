import java.util.Random;

public class PruebaRendimiento {

    public static void main(String[] args) {

        int[] tamaños = {1, 100, 1000, 10000, 100000};

        Random random = new Random();

        // Calentamiento de la JVM
        ejecutarCalentamiento();

        for (int n : tamaños) {

            SistemaCatalogo sistema = new SistemaCatalogo();

            Runtime runtime = Runtime.getRuntime();
            runtime.gc();

            long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

            long inicio = System.nanoTime();

            for (int i = 0; i < n; i++) {

                Categoria categoria = Categoria.values()[random.nextInt(Categoria.values().length)];

                Producto producto = new Producto(
                        "P" + i,
                        "Producto" + i,
                        random.nextDouble(5000),
                        categoria
                );

                sistema.agregarProducto(producto);
            }

            long fin = System.nanoTime();

            long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

            long tiempo = fin - inicio;
            long memoriaUsada = memoriaDespues - memoriaAntes;

            System.out.println("Productos: " + n);
            System.out.println("Tiempo de ejecución: " + (tiempo / 1_000_000) + " ms");
            System.out.println("Memoria usada: " + (memoriaUsada / 1024) + " KB");
            System.out.println("------------------------------------");
        }
    }

    private static void ejecutarCalentamiento() {

        SistemaCatalogo sistema = new SistemaCatalogo();

        for (int i = 0; i < 50; i++) {

            Producto p = new Producto(
                    "TEST" + i,
                    "ProductoTest",
                    i * 10,
                    Categoria.ELECTRONICA
            );

            sistema.agregarProducto(p);
        }
    }
}