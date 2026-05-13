# Proyecto-Gestor-Reuniones
Tarea 2 - Desarrollo Orientado a Objetos - Ingeniería Civil Informática

Desarrolladores:
- Martin Ignacio Bastias Neira
- Daniel Esteban Ortiz Estrada
- Benjamin Alonso Silva Sepúlveda

Cambios durante el desarrollo:

- Se creó una clase Persona de la cual heredan:
    - Empleado
    - InvitadoExterno
    Esto con el objetivo de reutilizar código implementando el concepto de herencia.
    Además, el polimorfismo permite hacer listas de "personas" dentro del proyecto.
- Persona implementa la interfaz Invitable. Evita ruido visual innecesario en el UML.

- La relación Empleado-Asistencia ahora es Persona-Asistencia.
    La relación ahora es de Composición.
    Esto tiene sentido porque una lista de asistencia no existe sin personas.