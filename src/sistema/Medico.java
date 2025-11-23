package sistema;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Persona {
    private String especialidad;
    private String numeroColegiatura;
    private List<String> horariosDisponibles; 

    public Medico(String dni, String nombre, String telefono, String correo, String especialidad, String numColegiatura) {
        super(dni, nombre, telefono, correo);
        this.especialidad = especialidad;
        this.numeroColegiatura = numColegiatura;
        this.horariosDisponibles = new ArrayList<>();
    }

    public String getEspecialidad() { return especialidad; }
    
    // AGREGAMOS ESTOS GETTERS PARA QUITAR LAS ADVERTENCIAS AMARILLAS:
    public String getNumeroColegiatura() { return numeroColegiatura; }
    public List<String> getHorariosDisponibles() { return horariosDisponibles; }
    
    @Override
    public String toString() {
        return "Dr/a. " + nombre + " [" + especialidad + "]";
    }
}