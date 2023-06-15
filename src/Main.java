import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de especialidades médicas
        Especialidad pediatria = new Especialidad("Pediatría", "willy, rex");
        Especialidad cirugia = new Especialidad("Cirugía", "veg, 777");

        // Creación de médicos
        Medico medico1 = new Medico("Médico", "Alexis Sanchez", "Dirección1", "Soltero", "11111111-1", "Horario1",
                "Pediatría", "HorarioAtencion1", new ArrayList<>(), pediatria);
        Medico medico2 = new Medico("Médico", "Humberto suazo", "Dirección2", "Casada", "22222222-2", "Horario2",
                "Cirugía", "HorarioAtencion2", new ArrayList<>(), cirugia);

        // Agregar médicos a las especialidades médicas
        pediatria.agregarMedico(medico1);
        cirugia.agregarMedico(medico2);

        Administrativo administrativo1 = new Administrativo("Administrativo", "Pepe", "Dirección3", "Viudo",
                "33333333-3", "Horario3", "aaaaaaa@aaaaaaaa.com", null);
        Administrativo administrativo2 = new Administrativo("Administrativo", "Pepa", "Dirección4", "Soltera",
                "44444444-4", "Horario4", "bbbbb@bbbb.com", null);


        Clinica clinica = new Clinica("Clínica XYZ", List.of("Dirección5", "Dirección6"), "Privada");

        clinica.agregarMedico(medico1);
        clinica.agregarMedico(medico2);
        clinica.agregarAdmin(administrativo1);
        clinica.agregarAdmin(administrativo2);

        List<Medico> medicosClinica = clinica.obtenerMC();
        System.out.println("Médicos de la clínica:");
        for (Medico medico : medicosClinica) {
            System.out.println(medico.getNombre());
        }

        List<Administrativo> administrativosClinica = clinica.obtenerAC();
        System.out.println("Administrativos de la clínica:");
        for (Administrativo administrativo : administrativosClinica) {
            System.out.println(administrativo.getNombre());
        }

        List<Medico> medicosEspecialidad = clinica.obtenerMedEspecialidad("Pediatría");
        System.out.println("Médicos de la especialidad Pediatría:");
        for (Medico medico : medicosEspecialidad) {
            System.out.println(medico.getNombre());
        }
        
        Administrativo administrativoEspecialidad = clinica.obtenerAdmEspecialidad("Cirugía",
                "Pepe",
                "33333333-3");
        if (administrativoEspecialidad != null) {
            System.out.println("Administrativo de la especialidad Cirugía encontrado:");
            System.out.println(administrativoEspecialidad.getNombre());
        } else {
            System.out.println("No se encontró ningún administrativo de la especialidad Cirugía.");
        }
    }
}