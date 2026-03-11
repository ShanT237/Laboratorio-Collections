import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Plataforma {
    private Queue<Solicitud> colaSolicitudes = new LinkedList<>();
    private HashMap<String, Solicitud> mapaSolicitudes = new HashMap<>();

    public void registrarSolicitud(Solicitud solicitud) {
        if (!mapaSolicitudes.containsKey(solicitud.getCodigo())) {
            mapaSolicitudes.put(solicitud.getCodigo(), solicitud);
            colaSolicitudes.add(solicitud);
        } else {
            System.out.println("La  solicitud ya existe en el sistema");
        }
    }

    public Solicitud atenderSolicitud() {
        Solicitud solicitud = colaSolicitudes.poll();
        if (solicitud != null) {
            mapaSolicitudes.remove(solicitud.getCodigo());
        }
        return solicitud;
    }

    public void cancelarSolicitud(String codigo) {
        Solicitud solicitud = mapaSolicitudes.remove(codigo);
        if (solicitud != null) {
            colaSolicitudes.remove(solicitud);
        }
    }

    public void mostrarSolicitudes() {
        for (Solicitud solicitud : colaSolicitudes) {
            System.out.println(solicitud);
        }
    }
}
