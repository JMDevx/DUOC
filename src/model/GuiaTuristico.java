package model;

/**
 * Representa un guia turistico.
 */
public class GuiaTuristico extends Persona {

    private String especialidad;

    /**
     * Constructor de GuiaTuristico.
     *
     * @param nombre nombre del guia
     * @param telefono telefono del guia
     * @param direccion direccion del guia
     * @param especialidad area de especialidad
     */
    public GuiaTuristico(String nombre,
                         String telefono,
                         Direccion direccion,
                         String especialidad) {

        super(nombre, telefono, direccion);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad.
     *
     * @return especialidad del guia
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Modifica la especialidad.
     *
     * @param especialidad nueva especialidad
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Especialidad: " + especialidad;
    }
}