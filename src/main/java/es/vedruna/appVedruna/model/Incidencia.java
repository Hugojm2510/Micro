package es.vedruna.appVedruna.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "incidencias")
@Data // Lombok genera los getters, setters, toString, etc.
@NoArgsConstructor // Lombok genera el constructor sin argumentos
@AllArgsConstructor // Lombok genera el constructor con todos los argumentos
public class Incidencia {
    
    @MongoId
    private String id;
    private String incidencia_picture;
    private String numero;
    private String titulo;
    private String comentario;
    private String estado;
    private LocalDateTime createdAt = LocalDateTime.now();
}
