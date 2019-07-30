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
public class systemuser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @Basic
    @Column(length = 256, nullable = false)
    @Length(max = 256)
    @NotEmpty
    private String firstName;

    public systemuser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
