package com.example.demo.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class casa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Basic
    @Column(length = 256, nullable = false)
    @Length(max = 256)
    @NotEmpty
    private String nro;

    @Basic
    @Column(length = 256, nullable = false)
    @Length(max = 256)
    @NotEmpty
    private String direccion;

    public casa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
