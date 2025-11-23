package sistema;
import java.util.Date;

public class Paciente extends Persona {
    private String direccion;
    private Date fechaNacimiento;

    public Paciente(String dni, String nombre, String telefono, String correo, String direccion, Date fechaNacimiento) {
        super(dni, nombre, telefono, correo);
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() { return direccion; }
    
    // AGREGAMOS ESTO PARA QUE DESAPAREZCA LA ADVERTENCIA:
    public Date getFechaNacimiento() { return fechaNacimiento; }

    @Override
    public String toString() {
        return "Paciente [DNI=" + dni + ", Nombre=" + nombre + "]";
    }
}