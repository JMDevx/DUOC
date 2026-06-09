![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Actividad Sumativa – Agencia de Turismo LlanquihueTour

## 👤 Autor del proyecto

* **Nombre completo:** Juan Bonilla
* **Carrera:** Analista Progamador Computacional
* **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a una actividad de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema representa parte de la estructura de una agencia de turismo llamada **Llanquihue Tour**, aplicando conceptos fundamentales de la programación orientada a objetos. Para ello se modelaron distintas entidades relacionadas entre sí mediante herencia y composición, permitiendo representar personas vinculadas a la organización y guías turísticos especializados.

Durante el desarrollo se aplicaron principios como encapsulamiento, reutilización de clases, organización modular del código y documentación mediante Javadoc.

---

## 🧱 Estructura general del proyecto

```plaintext
src/
├── app/
│   └── Main.java
└── model/
    ├── Direccion.java
    ├── Persona.java
    └── GuiaTuristico.java
```

### Relación entre las clases

* **Persona** corresponde a la clase base del sistema.
* **Direccion** es utilizada mediante composición dentro de la clase Persona.
* **GuiaTuristico** hereda de Persona y agrega el atributo especialidad.

---

## ⚙️ Funcionalidades implementadas

* Creación de clases organizadas en paquetes.
* Uso de atributos privados.
* Implementación de constructores.
* Métodos get y set.
* Sobrescritura del método toString().
* Relación de composición entre clases.
* Uso de herencia.
* Documentación mediante comentarios Javadoc.
* Prueba de funcionamiento desde la clase Main.
 
---

## ⚙️ Instrucciones para ejecutar el proyecto

1. Abrir el proyecto en IntelliJ IDEA.
2. Verificar que las clases estén organizadas en los paquetes `app` y `model`.
3. Ejecutar la clase `Main.java`.
4. Observar los resultados generados en la consola.

---

## 💻 Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Programación Orientada a Objetos (POO)
* Javadoc

---

## 📄 Salida esperada

```plaintext
Nombre: Juan Gomez, Telefono: 987654321, Direccion: Pedro Lautaro Ferrer 123, Providencia, RM

Nombre: Elizabeth Perez, Telefono: 912345678, Direccion: Av. Los Volcanes 120, Llanquihue, Los Lagos, Especialidad: Tours culturales

Nombre: Carlos Diaz, Telefono: 998877665, Direccion: Av. Los Volcanes 120, Llanquihue, Los Lagos, Especialidad: Tours Historicos
```

---

**Fecha de entrega:** [08/06/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
