package es.vedruna.appVedruna.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.vedruna.appVedruna.DTO.EstadoUpdateRequest;
import es.vedruna.appVedruna.model.Incidencia;
import es.vedruna.appVedruna.services.IncidenciaServiceImpI;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/proyecto01/incidencias")
@AllArgsConstructor
public class IncidenciasController {
    private final IncidenciaServiceImpI incidenciaServiceImpI;

    @GetMapping()
    public List<Incidencia> getAllIncidencias() {
        return incidenciaServiceImpI.getAllIncidencias();
    }

    @PostMapping()
    public Incidencia createIncidencia(@RequestBody Incidencia incidencia) {
        return incidenciaServiceImpI.createIncidencia(incidencia);
    }
    
    @PutMapping("/{id}")
    public Incidencia updatIncidencia(@PathVariable String id, @RequestBody Map<String, String> body) {
        String nuevoEstado = body.get("estado"); // Extrae el valor de "estado" correctamente
        return incidenciaServiceImpI.updateIncidencia(id, nuevoEstado);
    }

}
