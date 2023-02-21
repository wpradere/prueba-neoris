package com.neoris.prueba_tecnica.Services.Impl;

import com.neoris.prueba_tecnica.Model.Entidad.Cuenta;
import com.neoris.prueba_tecnica.Repository.CuentaRepository;
import com.neoris.prueba_tecnica.Services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;
    @Override
    public List<Cuenta> findAll() {
        return (List<Cuenta>) cuentaRepository.findAll();
    }
}
