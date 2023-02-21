package com.neoris.prueba_tecnica.Model.Entidad;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona {


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "genero")
    private  String genero;

    @Column(name = "edad")
    private int edad;

    @Column(name = "identificacion")
    private  String identificacion;

    @Column(name = "direccion")
    private  String direccion;

    @Column(name = "telefono")
    private  String telefono;

    public Persona(String nombre, String genero, int edad, String identificacion, String direccion, String telefono) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Persona() {

    }
}
