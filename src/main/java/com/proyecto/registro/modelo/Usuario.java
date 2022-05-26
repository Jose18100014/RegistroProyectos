// Generated with g9.

package com.proyecto.registro.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="usuario")
public class Usuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "id";

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, precision=10)
    private int id;
    @Column(nullable=false, length=15)
    private String alias;
    @Column(nullable=false, precision=10)
    private int numerocontrol;
    @Column(nullable=false, length=50)
    private String nombrecompleto;
    @Column(nullable=false, length=60)
    private String apellidos;
    @Column(nullable=false, length=20)
    private byte[] claveacceso;
    @OneToMany(mappedBy="usuario")
    private Set<Proyecto> proyecto;

    /** Default constructor. */
    public Usuario() {
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
     * Access method for alias.
     *
     * @return the current value of alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Setter method for alias.
     *
     * @param aAlias the new value for alias
     */
    public void setAlias(String aAlias) {
        alias = aAlias;
    }

    /**
     * Access method for numerocontrol.
     *
     * @return the current value of numerocontrol
     */
    public int getNumerocontrol() {
        return numerocontrol;
    }

    /**
     * Setter method for numerocontrol.
     *
     * @param aNumerocontrol the new value for numerocontrol
     */
    public void setNumerocontrol(int aNumerocontrol) {
        numerocontrol = aNumerocontrol;
    }

    /**
     * Access method for nombrecompleto.
     *
     * @return the current value of nombrecompleto
     */
    public String getNombrecompleto() {
        return nombrecompleto;
    }

    /**
     * Setter method for nombrecompleto.
     *
     * @param aNombrecompleto the new value for nombrecompleto
     */
    public void setNombrecompleto(String aNombrecompleto) {
        nombrecompleto = aNombrecompleto;
    }

    /**
     * Access method for apellidos.
     *
     * @return the current value of apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter method for apellidos.
     *
     * @param aApellidos the new value for apellidos
     */
    public void setApellidos(String aApellidos) {
        apellidos = aApellidos;
    }

    /**
     * Access method for claveacceso.
     *
     * @return the current value of claveacceso
     */
    public byte[] getClaveacceso() {
        return claveacceso;
    }

    /**
     * Setter method for claveacceso.
     *
     * @param aClaveacceso the new value for claveacceso
     */
    public void setClaveacceso(byte[] aClaveacceso) {
        claveacceso = aClaveacceso;
    }

    /**
     * Access method for proyecto.
     *
     * @return the current value of proyecto
     */
    public Set<Proyecto> getProyecto() {
        return proyecto;
    }

    /**
     * Setter method for proyecto.
     *
     * @param aProyecto the new value for proyecto
     */
    public void setProyecto(Set<Proyecto> aProyecto) {
        proyecto = aProyecto;
    }

    /**
     * Compares the key for this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuario)) {
            return false;
        }
        Usuario that = (Usuario) other;
        if (this.getId() != that.getId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuario)) return false;
        return this.equalKeys(other) && ((Usuario)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[Usuario |");
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
