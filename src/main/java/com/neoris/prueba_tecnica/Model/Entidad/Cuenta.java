package com.neoris.prueba_tecnica.Model.Entidad;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cuentas")
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuenta;

    @Column(name = "numero_cuenta")
    private String numeroCuenta;


    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

    @Column(name = "saldo_inicial")
    private Double saldoInicial;


    @Column(name = "estado")
    private boolean estado;
}
