//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Hospital hospital = new Hospital();
    hospital.registrarPacientes(new Paciente("1", "Santiago", "Cita General", LocalDate.now()));
    hospital.registrarPacientes(new Paciente("2", "Daiana", "Cita de Patitas", LocalDate.now()));
    hospital.registrarPacientes(new Paciente("3", "Tomatitos", "Cita de de ojo", LocalDate.now()));
    hospital.registrarPacientes(new Paciente("4", "Mofletitos", "Cita de Caracter", LocalDate.now()));

    System.out.println(hospital.buscarPaciente("2"));
    System.out.println("Atender paciente" + hospital.atenderPaciente());
    hospital.mostrarCola();
}
