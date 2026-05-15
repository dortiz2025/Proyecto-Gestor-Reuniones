# Proyecto-Gestor-Reuniones

**Tarea 2 - Desarrollo Orientado a Objetos - Ingeniería Civil Informática**

**Desarrolladores:**
- Martin Ignacio Bastias Neira
- Daniel Esteban Ortiz Estrada
- Benjamin Alonso Silva Sepúlveda

**Cambios en el diseño durante el desarrollo:**

- Se creó una clase Persona de la cual heredan:
    - Empleado
    - InvitadoExterno  
Esto con el objetivo de reutilizar código implementando el concepto de herencia.  
Además, el polimorfismo permite hacer listas de "personas" dentro del proyecto.  


- Persona implementa la interfaz Invitable. Tanto Empleado como InvitadoExterno pueden ser invitados.


- La relación Empleado-Asistencia ahora es Persona-Asistencia para incluir a InvitadoExterno.


- Se cambia formato Date por LocalDate para atributo fecha en Reunion.
  El formato es más amigable para una fecha.