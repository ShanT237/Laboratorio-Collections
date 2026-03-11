import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private String documento;
    private String nombre;
    private String motivo;
    private LocalDate fechaAgendada;

    public Paciente(String documento, String nombre, String motivo, LocalDate fechaAgendada) {
        this.documento = documento;
        this.nombre = nombre;
        this.motivo = motivo;
        this.fechaAgendada = fechaAgendada;
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDate getFechaAgendada() {
        return fechaAgendada;
    }

    public void setFechaAgendada(LocalDate fechaAgendada) {
        this.fechaAgendada = fechaAgendada;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "documento='" + documento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", motivo='" + motivo + '\'' +
                ", fechaAgendada=" + fechaAgendada +
                '}';
    }
}
