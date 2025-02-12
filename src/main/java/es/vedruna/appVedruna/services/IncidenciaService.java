package es.vedruna.appVedruna.services;

import java.util.List;

import es.vedruna.appVedruna.model.Incidencia;

public interface IncidenciaService {
    List<Incidencia> getAllIncidencias();
    Incidencia createIncidencia(Incidencia incidencia);
    Incidencia updateIncidencia(String id, String nuevoEstado);
}
