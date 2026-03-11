//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Plataforma plataforma = new Plataforma();
    // Crear usuarios
    Usuario u1 = new Usuario("Tomatitos", "101", "Centro");
    Usuario u2 = new Usuario("Santiago", "102", "Norte");
    Usuario u3 = new Usuario("Daiana", "103", "Sur");

    // Crear solicitudes
    Solicitud s1 = new Solicitud("S1", "Aeropuerto", u1);
    Solicitud s2 = new Solicitud("S2", "Terminal", u2);
    Solicitud s3 = new Solicitud("S3", "Hospital", u3);

    // Registrar solicitudes
    plataforma.registrarSolicitud(s1);
    plataforma.registrarSolicitud(s2);
    plataforma.registrarSolicitud(s3);

    System.out.println("Solicitudes registradas:");
    plataforma.mostrarSolicitudes();

    System.out.println("\nAtendiendo solicitud...");
    Solicitud atendida = plataforma.atenderSolicitud();
    System.out.println("Solicitud atendida: " + atendida.getCodigo());

    System.out.println("\nSolicitudes restantes:");
    plataforma.mostrarSolicitudes();

    System.out.println("\nCancelando solicitud S3...");
    plataforma.cancelarSolicitud("S3");

    System.out.println("\nSolicitudes finales:");
    plataforma.mostrarSolicitudes();
}

