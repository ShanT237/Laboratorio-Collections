import java.time.LocalDate;

public class PruebaRendimiento {

    public static void main(String[] args) {

        int[] tamaños = {1, 100, 1000, 10000, 100000};

        for (int n : tamaños) {

            Hospital sistema = new Hospital();

            Runtime runtime = Runtime.getRuntime();
            runtime.gc();

            long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

            long inicio = System.nanoTime();

            for (int i = 0; i < n; i++) {

                Paciente p = new Paciente(
                        String.valueOf(i),
                        "Paciente" + i,
                        "Consulta general",
                        LocalDate.now()
                );

                sistema.registrarPacientes(p);
            }

            long fin = System.nanoTime();

            long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();

            long tiempo = fin - inicio;
            long memoria = memoriaDespues - memoriaAntes;

            System.out.println("Cantidad pacientes: " + n);
            System.out.println("Tiempo ejecución: " + (tiempo / 1_000_000) + " ms");
            System.out.println("Memoria usada: " + (memoria / 1024) + " KB");
            System.out.println("--------------------------------");
        }
    }
}