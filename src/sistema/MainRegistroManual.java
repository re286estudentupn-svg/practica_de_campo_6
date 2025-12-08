package sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRegistroManual {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        GestorArchivos gestor = new GestorArchivos();
        List<Paciente> listaPacientes = new ArrayList<>();
        
        System.out.println("=== SISTEMA DE ADMISIÓN (MODO MANUAL) ===");
        System.out.println("Nota: Los datos se guardarán al finalizar.");

        boolean continuar = true;
        while(continuar) {
            System.out.println("\n--- NUEVO REGISTRO ---");
            
            System.out.print("Ingrese DNI: ");
            String dni = teclado.nextLine();
            
            System.out.print("Ingrese Nombre Completo: ");
            String nombre = teclado.nextLine();
            
            System.out.print("Ingrese Telefono: ");
            String telefono = teclado.nextLine();
            
            System.out.print("Ingrese Correo: ");
            String correo = teclado.nextLine();
            
            System.out.print("Ingrese Dirección: ");
            String direccion = teclado.nextLine();
            
            // Creamos el paciente y lo agregamos a la lista temporal
            Paciente p = new Paciente(dni, nombre, telefono, correo, direccion, null);
            listaPacientes.add(p);
            
            System.out.print("¿Desea registrar otro paciente? (S/N): ");
            String respuesta = teclado.nextLine();
            if(respuesta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }
        
        // GUARDADO FINAL
        System.out.println("\n[...] Guardando información en base de datos...");
        gestor.guardarPacientes(listaPacientes);
        System.out.println("REGISTRO MANUAL FINALIZADO CON ÉXITO");
        
        teclado.close();
    }
}