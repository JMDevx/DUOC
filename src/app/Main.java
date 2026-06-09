package app;

import model.Direccion;
import model.GuiaTuristico;
import model.Persona;

/**
 * Clase principal del programa.
 */
public class Main {

    /**
     * Constructor por defecto.
     */
    public Main() {
    }

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {

        Direccion direccion1 =
                new Direccion(
                        "Av. Los Volcanes 120",
                        "Llanquihue",
                        "Los Lagos"
                );

        Direccion direccion2 =
                new Direccion(
                        "Pedro Lautaro Ferrer 123",
                        "Providencia",
                        "RM"
                );
        Persona persona1 =
                new Persona(
                        "Juan Gomez",
                        "987654321",
                        direccion2
                );

        GuiaTuristico guia1 =
                new GuiaTuristico(
                        "Elizabeth Perez",
                        "912345678",
                        direccion1,
                        "Tours culturales"
                );

        GuiaTuristico guia2 =
                new GuiaTuristico(
                        "Carlos Diaz",
                        "998877665",
                        direccion1,
                        "Tours Historicos"
                );

        System.out.println(persona1);
        System.out.println();

        System.out.println(guia1);
        System.out.println();

        System.out.println(guia2);
    }
}