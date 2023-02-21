package com.neoris.prueba_tecnica.Model.Entidad;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "clientes")
public class Cliente extends Persona  {





    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "telefono")
    public String telefono;

    @Column(name = "direccion")
    public String direccion;

    public Cliente(String nombre, String genero, int edad, String identificacion, String direccion, String telefono, Long idCliente) {
        super(nombre, genero, edad, identificacion, direccion, telefono);
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;


    }
    public Cliente() {
        super();
    }




}
