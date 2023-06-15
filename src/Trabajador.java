
public abstract class Trabajador {
    private String tituloProfesional;
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private String rut;
    private String horarioTrabajo;

    public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo) {
        this.tituloProfesional = tituloProfesional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRut() {
        return rut;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public abstract String getTipo();
}