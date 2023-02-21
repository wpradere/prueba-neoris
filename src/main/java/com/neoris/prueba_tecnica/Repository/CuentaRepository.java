package com.neoris.prueba_tecnica.Repository;

import com.neoris.prueba_tecnica.Model.Entidad.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaRepository extends CrudRepository<Cuenta,Long> {
}
