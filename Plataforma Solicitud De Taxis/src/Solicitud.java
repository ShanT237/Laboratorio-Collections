public class Solicitud {
    private String codigo;
    private String detino;
    private Usuario usuario;


    public Solicitud(String codigo, String detino, Usuario usuario) {
        this.codigo = codigo;
        this.detino = detino;
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getDetino() {
        return detino;
    }

    public void setDetino(String detino) {
        this.detino = detino;
    }
}
