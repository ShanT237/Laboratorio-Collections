import java.util.Random;

public class PruebaRendimiento {

    public static void main(String[] args) {

        int[] tamaños = {1, 100, 1000, 10000, 100000};
        Random random = new Random();

        // calentamiento de JVM
        ejecutarPrueba(10);

        for (int n : tamaños) {

            Plataforma plataforma = new Plataforma();

            Runtime runtime = Runtime.getRuntime();
            runtime.gc();

            long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

            long inicio = System.nanoTime();

            for (int i = 0; i < n; i++) {

                Usuario usuario = new Usuario(
                        "Usuario" + i,
                        "ID" + i,
                        "Zona" + random.nextInt(10)
                );

                Solicitud solicitud = new Solicitud(
                        "SOL" + i,
                        "Destino" + random.nextInt(10),
                        usuario
                );

                plataforma.registrarSolicitud(solicitud);
            }

            long fin = System.nanoTime();

            long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

            long tiempo = fin - inicio;
            long memoriaUsada = memoriaDespues - memoriaAntes;

            System.out.println("Solicitudes: " + n);
            System.out.println("Tiempo ejecución: " + (tiempo / 1_000_000) + " ms");
            System.out.println("Memoria usada: " + (memoriaUsada / 1024) + " KB");
            System.out.println("--------------------------------");
        }
    }

    private static void ejecutarPrueba(int n){

        Plataforma plataforma = new Plataforma();

        for (int i = 0; i < n; i++) {

            Usuario usuario = new Usuario("Test", "ID"+i, "Zona");

            Solicitud solicitud = new Solicitud(
                    "SOL"+i,
                    "Destino",
                    usuario
            );

            plataforma.registrarSolicitud(solicitud);
        }
    }
}