package com.jmendeztech.dbsearcher.model;

 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "Ccinformation_2")
public class CcInformation {

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Id
    @Column(name = "tarjetacc", columnDefinition = "VARCHAR(MAX)")
    private String tarjetacc;

    // Constructors
    public CcInformation() {
    }

    public CcInformation(String nombre, String tarjetacc) {
        this.nombre = nombre;
        this.tarjetacc = tarjetacc;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjetacc() {
        return tarjetacc;
    }

    public void setTarjetacc(String tarjetacc) {
        this.tarjetacc = tarjetacc;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "CcInformation{" +
                "nombre='" + nombre + '\'' +
                ", tarjetacc='" + tarjetacc + '\'' +
                '}';
    }
}

