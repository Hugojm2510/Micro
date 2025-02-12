package es.vedruna.appVedruna.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import es.vedruna.appVedruna.model.Incidencia;

import java.util.List;

@Repository
public interface IncidenciasRepository extends MongoRepository<Incidencia, String> {
    List<Incidencia> findAllByOrderByCreatedAtDesc();
}
