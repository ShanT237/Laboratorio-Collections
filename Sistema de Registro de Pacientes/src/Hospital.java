import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
    private HashMap<String, Paciente> mapaPacientes = new HashMap<>();
    private Queue<Paciente> colaPacientes = new LinkedList<>();

    public void registrarPacientes(Paciente paciente){

        if(!mapaPacientes.containsKey(paciente.getDocumento())){
            mapaPacientes.put(paciente.getDocumento(), paciente);
            colaPacientes.add(paciente);
        } else{
            System.out.println("El paciente ya se encuentra registrado");
        }
    }


    public Paciente buscarPaciente(String documento){
        return mapaPacientes.get(documento);
    }

    public Paciente atenderPaciente(){
        Paciente paciente = colaPacientes.poll();
        if(paciente != null){
            mapaPacientes.remove(paciente.getDocumento());

        }
        return paciente;
    }

    public void mostrarCola(){
        for (Paciente paciente : colaPacientes){
            System.out.println(paciente);
        }
    }
}
