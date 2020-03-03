package br.com.rodrigues.transportador.repository;

import br.com.rodrigues.transportador.model.Entrega;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Long>{

}
