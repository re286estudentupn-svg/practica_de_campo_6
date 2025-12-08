SISTEMA DE GESTION DE CITAS PARA POSTAS RURALES
Universidad Privada del Norte
Curso: Taller de Programación Orientada a Objetos
---------------------------------------------------

DESCRIPCION
Este proyecto es un sistema desarrollado en Java para gestionar citas médicas en postas rurales que no tienen conexión a internet.
El objetivo principal es reemplazar el uso de cuadernos físicos y guardar la información en archivos de texto (CSV) para evitar la pérdida de datos.

---------------------------------------------------

FUNCIONAMIENTO
El sistema utiliza Java y no requiere una base de datos externa (como MySQL), ya que guarda todo en archivos locales. Esto permite que funcione en computadoras antiguas o sin red.

Las principales funciones son:
- Registro de pacientes (con validación de DNI).
- Registro de médicos y especialidades.
- Programación de citas médicas.
- Guardado automático de datos en disco (Persistencia).

---------------------------------------------------

INSTRUCCIONES DE EJECUCION
El proyecto cuenta con dos archivos principales dentro del paquete 'sistema' para probar el funcionamiento:

1. MainPrueba.java (Modo Simulación)
   Ejecuta esta clase para ver una prueba rápida. El sistema cargará automáticamente 5 pacientes y generará las citas para demostrar que la lógica y el guardado de archivos funcionan correctamente.

2. MainRegistroManual.java (Modo Usuario)
   Ejecuta esta clase si deseas ingresar los datos manualmente por teclado (consola), simulando el trabajo de una recepcionista.

---------------------------------------------------

ESTRUCTURA DE ARCHIVOS
src/sistema/
 - Persona.java: Clase base para la herencia.
 - Paciente.java: Hereda de Persona, incluye datos médicos.
 - Medico.java: Hereda de Persona, incluye especialidad.
 - Cita.java: Relaciona al paciente con el médico.
 - GestorArchivos.java: Clase encargada de leer y escribir el archivo CSV.

---------------------------------------------------

AUTOR
Renzo Alexander Palomino Ramos
Ingeniería de Sistemas Computacionales
Ciclo 2025-5
