/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.um.fit.librodevisita.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author LidiaE_18
 */
@Entity
public class Localizacion implements Serializable{
    
  @Id
  @GeneratedValue  (strategy = GenerationType.IDENTITY)
  private Long Id;
  @Version
  private Integer version;
  private float longitud;
  private float latitud;

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
    
      @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hash(this.Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Localizacion other = (Localizacion) obj;
        return Objects.equals(this.Id, other.Id);
    }

    @Override
    public String toString() {
        return "{Localizacion{Id:" + this.Id + ", longitud:" + this.longitud + ", latitud:" + this.latitud + "}}";
    }

    
    }

