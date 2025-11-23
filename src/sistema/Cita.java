package sistema;
import java.util.Date;

public class Cita {
    private String idCita;
    private Date fecha;
    private String estado;
    private Medico medico;
    private Paciente paciente;

    public Cita(Medico medico, Paciente paciente, Date fecha) {
        this.medico = medico;
        this.paciente = paciente;
        this.fecha = fecha;
        this.estado = "Pendiente";
        this.idCita = "C-" + (int)(Math.random() * 1000);
    }

    public void confirmarCita() {
        this.estado = "Confirmada";
    }
    
    // AGREGADO PARA QUITAR ADVERTENCIA:
    public Date getFecha() { return fecha; }

    @Override
    public String toString() {
        return "Cita: " + idCita + " | Paciente: " + paciente.getNombre() + " | Medico: " + medico.getNombre() + " | Estado: " + estado;
    }
}