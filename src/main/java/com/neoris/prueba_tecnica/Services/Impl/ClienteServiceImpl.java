package com.neoris.prueba_tecnica.Services.Impl;

import com.neoris.prueba_tecnica.Model.Entidad.Cliente;
import com.neoris.prueba_tecnica.Repository.ClienteRepository;
import com.neoris.prueba_tecnica.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public void delete(Long id) {
    Optional<Cliente> cliente= clienteRepository.findById(id);
    }

    @Override
    public Optional<Cliente> findOne(Long id) {
        return Optional.ofNullable(clienteRepository.findById(id).orElse(null));
    }
}
