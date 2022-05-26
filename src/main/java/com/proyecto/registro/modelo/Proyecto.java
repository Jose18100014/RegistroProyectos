// Generated with g9.

package com.proyecto.registro.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name="proyecto")
public class Proyecto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=30)
    private String nombreproyecto;
    @Column(nullable=false, length=40)
    private String responsable;
    @Column(nullable=false)
    private String nombreintegrantes;
    @Column(nullable=false, length=30)
    private String areaproyecto;
    @Column(nullable=false)
    private String descripcion;
    @ManyToOne(optional=false)
    @JoinColumn(name="idautor", nullable=false)
    private Usuario usuario;

    /** Default constructor. */
    public Proyecto() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
    }

    /**
     * Access method for nombreproyecto.
     *
     * @return the current value of nombreproyecto
     */
    public String getNombreproyecto() {
        return nombreproyecto;
    }

    /**
     * Setter method for nombreproyecto.
     *
     * @param aNombreproyecto the new value for nombreproyecto
     */
    public void setNombreproyecto(String aNombreproyecto) {
        nombreproyecto = aNombreproyecto;
    }

    /**
     * Access method for responsable.
     *
     * @return the current value of responsable
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * Setter method for responsable.
     *
     * @param aResponsable the new value for responsable
     */
    public void setResponsable(String aResponsable) {
        responsable = aResponsable;
    }

    /**
     * Access method for nombreintegrantes.
     *
     * @return the current value of nombreintegrantes
     */
    public String getNombreintegrantes() {
        return nombreintegrantes;
    }

    /**
     * Setter method for nombreintegrantes.
     *
     * @param aNombreintegrantes the new value for nombreintegrantes
     */
    public void setNombreintegrantes(String aNombreintegrantes) {
        nombreintegrantes = aNombreintegrantes;
    }

    /**
     * Access method for areaproyecto.
     *
     * @return the current value of areaproyecto
     */
    public String getAreaproyecto() {
        return areaproyecto;
    }

    /**
     * Setter method for areaproyecto.
     *
     * @param aAreaproyecto the new value for areaproyecto
     */
    public void setAreaproyecto(String aAreaproyecto) {
        areaproyecto = aAreaproyecto;
    }

    /**
     * Access method for descripcion.
     *
     * @return the current value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param aDescripcion the new value for descripcion
     */
    public void setDescripcion(String aDescripcion) {
        descripcion = aDescripcion;
    }

    /**
     * Access method for usuario.
     *
     * @return the current value of usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Setter method for usuario.
     *
     * @param aUsuario the new value for usuario
     */
    public void setUsuario(Usuario aUsuario) {
        usuario = aUsuario;
    }

    /**
     * Compares the key for this instance with another Proyecto.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Proyecto and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Proyecto)) {
            return false;
        }
        Proyecto that = (Proyecto) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Proyecto.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Proyecto)) return false;
        return this.equalKeys(other) && ((Proyecto)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Proyecto |");
        sb.append(" id=").append(getId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("id", Integer.valueOf(getId()));
        return ret;
    }

}
