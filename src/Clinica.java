import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nombre;
    private List<String> direcciones;
    private String tipo;
    private List<Medico> medicos;
    private List<Administrativo> administrativos;

    public Clinica(String nombre, List<String> direcciones, String tipo) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.tipo = tipo;
        this.medicos = new ArrayList<>();
        this.administrativos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getDirecciones() {
        return direcciones;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarAdmin(Administrativo administrativo) {
        administrativos.add(administrativo);
    }

    public List<Medico> obtenerMC() {
        return medicos;
    }

    public List<Administrativo> obtenerAC() {
        return administrativos;
    }

    public List<Medico> obtenerMedEspecialidad(String nombreEspecialidad) {
        List<Medico> medicosEspecialidad = new ArrayList<>();
        for (Medico medico : medicos) {
            if (medico.getEspecialidad().getNombre().equals(nombreEspecialidad)) {
                medicosEspecialidad.add(medico);
            }
        }
        return medicosEspecialidad;
    }

    public Administrativo obtenerAdmEspecialidad(String nombreEspecialidad, String nombreAdministrativo, String rutAdministrativo) {
        for (Administrativo administrativo : administrativos) {
            if (administrativo.getTipo().equals("Administrativo") &&
                    administrativo.getNombre().equals(nombreAdministrativo) &&
                    administrativo.getRut().equals(rutAdministrativo)) {

                for (Medico medico : administrativo.getEspecialidad().getMedicosAsociados()) {
                    if (medico.getEspecialidad().getNombre().equals(nombreEspecialidad)) {
                        return administrativo;
                    }
                }
            }
        }
        return null;
    }
}

