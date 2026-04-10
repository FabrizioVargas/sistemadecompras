# Gestor de Tareas (Java Swing)

Este es un proyecto sencillo de escritorio para gestionar tareas pendientes. Lo hice usando el patrón **MVC** para que el código esté ordenado y sea fácil de entender.

## Descripción del proyecto
La aplicación sirve para anotar tareas, ver cuáles tienes pendientes y marcarlas como completadas mediante una interfaz gráfica.
* **Agregar:** Escribes la tarea y aparece en la tabla con fondo azul.
* **Completar:** Cambia el estado a "Completada" con un botón verde.
* **Eliminar:** Borra la tarea seleccionada con un botón rojo.

## Cómo ejecutar
1. Abre el proyecto en tu IDE (IntelliJ, NetBeans o Eclipse).
2. Busca la carpeta `src/vallegrande/sistemadecontrol`.
3. Ejecuta el archivo **GestorTareasApp.java**.

## Explicación del uso de POO
En este proyecto apliqué conceptos clave de la Programación Orientada a Objetos:

* **Clases y Objetos:** Creé la clase `Tarea` que sirve como molde para cada actividad registrada.
* **Patrón MVC:** Separé el programa en tres partes (Modelo, Vista y Controlador) para que la interfaz no se mezcle con la lógica de los datos.
* **Encapsulamiento:** Los datos de las tareas son privados. Solo se pueden leer o modificar usando métodos `get` y `set`, lo que hace al código más seguro.
* **Herencia:** Usé `extends JFrame` para crear la ventana y `extends AbstractListModel` para que el modelo funcione con los componentes de Java sin tener que programar todo desde cero.

---
Proyecto para el Sistema de Control Valle Grande.