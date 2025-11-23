// PROYECTO FINAL - CURSO POO - 2025
// INTEGRANTE: Renzo Palomino
// FECHA DE ACTUALIZACIÓN: 23/11/2025
// ESTADO: Versión Final (Simulación Completa)

package sistema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainPrueba {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   SISTEMA DE GESTION DE CITAS RURALES v2.0");
        System.out.println("   Posta Médica 'San Juan de los Andes'");
        System.out.println("=================================================\n");
        
        GestorArchivos gestor = new GestorArchivos();
        List<Paciente> listaPacientes = new ArrayList<>();
        List<Medico> listaMedicos = new ArrayList<>();
        List<Cita> listaCitas = new ArrayList<>();

        // ---------------------------------------------------------
        // PASO 1: CARGA DE PERSONAL MÉDICO (Simulación)
        // ---------------------------------------------------------
        System.out.println("[1] Registrando Personal Médico...");
        Medico med1 = new Medico("10889900", "Dr. Martin Torres", "991122333", "martin@posta.pe", "Medicina General", "CMP-5544");
        Medico med2 = new Medico("20556677", "Dra. Ana Quispe", "987654321", "ana@posta.pe", "Pediatria", "CMP-9988");
        
        listaMedicos.add(med1);
        listaMedicos.add(med2);

        for (Medico m : listaMedicos) {
            System.out.println("    + Personal activo: " + m.toString());
        }

        // ---------------------------------------------------------
        // PASO 2: ADMISIÓN DE PACIENTES (Registro masivo)
        // ---------------------------------------------------------
        System.out.println("\n[2] Registrando Pacientes en Admisión...");
        listaPacientes.add(new Paciente("40001111", "Renzo Palomino", "999111222", "renzo@mail.com", "Av. Peru 123", null));
        listaPacientes.add(new Paciente("10203040", "Maria Lopez", "988777666", "maria@mail.com", "Jr. Callao 456", null));
        listaPacientes.add(new Paciente("77665544", "Juan Perez", "911222333", "juan@mail.com", "Calle Real 789", null));
        listaPacientes.add(new Paciente("09876543", "Elena Mamani", "900100200", "elena@mail.com", "Av. Sol 555", null));
        listaPacientes.add(new Paciente("11223344", "Carlos Rojas", "955666777", "carlos@mail.com", "Psje. Luna 22", null));

        System.out.println("    -> " + listaPacientes.size() + " pacientes registrados correctamente.");

        // ---------------------------------------------------------
        // PASO 3: PROGRAMACIÓN DE CITAS (Uso de Clases Relacionadas)
        // ---------------------------------------------------------
        System.out.println("\n[3] Generando Citas Médicas...");
        // Cita 1: Renzo con Dr. Martin
        Cita cita1 = new Cita(med1, listaPacientes.get(0), new Date());
        listaCitas.add(cita1);
        
        // Cita 2: Maria con Dra. Ana
        Cita cita2 = new Cita(med2, listaPacientes.get(1), new Date());
        cita2.confirmarCita(); // Simulamos que esta ya se confirmó
        listaCitas.add(cita2);

        for (Cita c : listaCitas) {
            System.out.println("    -> " + c.toString());
        }

        // ---------------------------------------------------------
        // PASO 4: PERSISTENCIA DE DATOS (Guardar en Archivo)
        // ---------------------------------------------------------
        System.out.println("\n[4] Iniciando respaldo de base de datos...");
        gestor.guardarPacientes(listaPacientes);

        // ---------------------------------------------------------
        // PASO 5: VALIDACIÓN (Lectura desde disco)
        // ---------------------------------------------------------
        System.out.println("\n[5] Simulando reinicio de sistema (Lectura)...");
        List<Paciente> recuperados = gestor.cargarPacientes();
        
        System.out.println("   --- REPORTE DE PACIENTES RECUPERADOS ---");
        for (Paciente p : recuperados) {
            System.out.println("   [OK] " + p.getDni() + " - " + p.getNombre() + " (" + p.getDireccion() + ")");
        }
        
        System.out.println("\n=================================================");
        System.out.println("   PRUEBA FINALIZADA - SISTEMA OPERATIVO");
        System.out.println("=================================================");
    }
}