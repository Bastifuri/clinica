import java.util.List;

public class Medico extends Trabajador {
    private String especializacion;
    private String horarioAtencion;
    private List<String> pacientesAsignados;
    private Especialidad especialidad;

    public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo,
                  String especializacion, String horarioAtencion, List<String> pacientesAsignados, Especialidad especialidadMedica) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
        this.especializacion = especializacion;
        this.horarioAtencion = horarioAtencion;
        this.pacientesAsignados = pacientesAsignados;
        this.especialidad = especialidad;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public List<String> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    @Override
    public String getTipo() {
        return "Médico";
    }
}