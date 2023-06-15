import java.util.ArrayList;
import java.util.List;

public class Especialidad {
    private String nombre;
    private String ubicacion;
    private List<Medico> medicosAsociados;

    public Especialidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.medicosAsociados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<Medico> getMedicosAsociados() {
        return medicosAsociados;
    }

    public void agregarMedico(Medico medico) {
        medicosAsociados.add(medico);
    }
}