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
Además, el polimorfismo permite hacer listas de "personas" tanto para 
invitados que son Empleados como para InvitadosExternos.  
Esto implica que la relación Empleado-Asistencia 
ahora es Persona-Asistencia para incluir a InvitadoExterno.


- Tanto Persona como Departamento implementan la interfaz Invitable.
  Estos pueden ser invitados manteniendo el método del diseño original.
  Además, se añadieron dos nuevos métodos que surgieron como una solución
  a un problema de modularidad y violación de responsabilidad única en la clase Reunion.
  Quienes implementan Invitable ahora se ven obligados a responder (de llamarse al método)
  si incluyen a cierta persona o no, y a entregar una lista de personas que representan.
  Esto es util por ejemplo; cuando se quiere añadir una asistencia, 
  ya que al consultar la lista de invitaciones, un departamento puede 
  haber sido invitado, pero queremos saber a quienes se contemplaba en esa invitación
  para así saber si el que intenta registrarse en Asistencia, había sido invitado.
  De lo anterior, se tiene que la interfaz invitable tiene una relación de asociación dirigida a persona.


- Se cambia Date por LocalDate para atributo fecha en Reunion.
  También se usa particularmente en un caso LocalTime en vez de Instant.
  El nuevo formato es más amigable para estos atributos.


- Para mantener la encapsulación, se omitieron los setters 
  de algunos atributos en las clases. De otra manera se 
  podrían modificar arbitrariamente (no queremos eso).
  La parcial modificación de algunos atributos se realiza únicamente a través de los adders.

- En clase reunión se añadieron parámetros para los métodos de iniciar y finalizar.
  Esto permite que se puedan realizar unit tests.


- Para atributos de tipo Instant se usó un formato amigable 
  al imprimirlos en los métodos toString, usando DateTimeFormatter y ZoneId.


- En el toString de Reunión y Departamento se usó una concatenación 
  optimizada que entrega java con StringBuilder y append().
  Esto dado que los string en sí no son modificables y 
  usar "+" tantas veces muestra un diseño para nada eficiente.