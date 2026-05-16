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


- Persona implementa la interfaz Invitable. 
  Tanto Empleado como InvitadoExterno pueden ser invitados.


- La relación Empleado-Asistencia ahora es Persona-Asistencia para incluir a InvitadoExterno.


- Se cambia Date por LocalDate para atributo fecha en Reunion.
  También se usa particularmente en un caso LocalTime en vez de Instant.
  El nuevo formato es más amigable para estos atributos.


- Para mantener la encapsulación, se omitieron los setters 
  de algunos atributos de reunion críticos.
  La parcial modificación de algunos atributos se realiza únicamente a través de los adders.

- En clase reunión se añadieron parámetros para los métodos de iniciar y finalizar.
  Esto permite que se puedan realizar unit tests.