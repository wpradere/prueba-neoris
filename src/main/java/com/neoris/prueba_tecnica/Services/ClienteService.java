package com.neoris.prueba_tecnica.Services;

import com.neoris.prueba_tecnica.Model.Entidad.Cliente;


import java.util.List;
import java.util.Optional;

public interface ClienteService {

    public List<Cliente> findAll();
    public void save (Cliente cliente);
    public void delete (Long id);
    public Optional<Cliente> findOne(Long id);


}
