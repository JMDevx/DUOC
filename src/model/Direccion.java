package model;

/**
 * Representa una direccion.
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    /**
     * Constructor de Direccion.
     *
     * @param calle nombre de la calle
     * @param ciudad ciudad de la direccion
     * @param region region de la direccion
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    /**
     * Obtiene la calle.
     *
     * @return nombre de la calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica la calle.
     *
     * @param calle nueva calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la ciudad.
     *
     * @return nombre de la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modifica la ciudad.
     *
     * @param ciudad nueva ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene la region.
     *
     * @return nombre de la region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Modifica la region.
     *
     * @param region nueva region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}