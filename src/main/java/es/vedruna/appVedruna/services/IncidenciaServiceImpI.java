package es.vedruna.appVedruna.services;

import java.util.List;

import org.springframework.stereotype.Service;

import es.vedruna.appVedruna.model.Incidencia;
import es.vedruna.appVedruna.repository.IncidenciasRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class IncidenciaServiceImpI implements IncidenciaService{
    
    private final IncidenciasRepository incidenciasRepository;

    public List<Incidencia> getAllIncidencias() {
        return incidenciasRepository.findAllByOrderByCreatedAtDesc();
    }

    @Override
    public Incidencia createIncidencia(Incidencia incidencia) {
        return incidenciasRepository.save(incidencia);
    }

    @Override
    public Incidencia updateIncidencia(String id, String nuevoEstado) {
    return incidenciasRepository.findById(id)
        .map(incidencia -> {
            incidencia.setEstado(nuevoEstado);
            return incidenciasRepository.save(incidencia);
        })
        .orElseThrow(() -> new RuntimeException("Incidencia no encontrada con ID: " + id));
    }
}
