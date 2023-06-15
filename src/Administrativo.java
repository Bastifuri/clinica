public class Administrativo extends Trabajador {
    private String correoElectronico;
    private Especialidad especialidad;


    public Administrativo(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo,
                          String correoElectronico, Especialidad especialidadMedica) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
        this.correoElectronico = correoElectronico;
        this.especialidad = especialidadMedica;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    @Override
    public String getTipo() {
        return "Administrativo";
    }
}