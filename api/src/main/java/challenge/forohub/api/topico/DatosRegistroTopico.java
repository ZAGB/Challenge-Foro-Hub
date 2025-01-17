package challenge.forohub.api.topico;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        LocalDateTime fechaCreacion,
        @JsonAlias("status_topic") Integer estadoTopico,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}
