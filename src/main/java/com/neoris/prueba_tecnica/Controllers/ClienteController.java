package com.neoris.prueba_tecnica.Controllers;

import com.neoris.prueba_tecnica.Model.Entidad.Cliente;
import com.neoris.prueba_tecnica.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

@GetMapping("/clientes")
public List<Cliente> clientesTotal(){

    return clienteService.findAll();
}


    @PostMapping("/clientes")
    public Cliente  crear(@RequestBody Cliente cliente){
        clienteService.save(cliente);
        return cliente;
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> encontrarCliente(@PathVariable Long id){
        return clienteService.findOne(id);
    }


    @PostMapping("/save/")
    public Cliente saveCliente (@RequestBody Cliente cliente){
      clienteService.save(cliente);
    return cliente;
    }

    @DeleteMapping("/delete/{id}")
    public void delete ( @PathVariable Long id){
    clienteService.delete(id);
    }


}
