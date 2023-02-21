package com.neoris.prueba_tecnica.Model.Entidad;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "movimientos")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimientos;


    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

}
