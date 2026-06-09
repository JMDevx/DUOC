package model;

/**
 * Clase base para representar una persona.
 */
public class Persona {

    private String nombre;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor de Persona.
     *
     * @param nombre nombre de la persona
     * @param telefono telefono de contacto
     * @param direccion direccion asociada
     */
    public Persona(String nombre, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre.
     *
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el telefono.
     *
     * @return telefono de la persona
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el telefono.
     *
     * @param telefono nuevo telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la direccion.
     *
     * @return direccion asociada
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la direccion.
     *
     * @param direccion nueva direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Telefono: " + telefono +
                ", Direccion: " + direccion;
    }
}