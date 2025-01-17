package challenge.forohub.api.topico;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ActulizaTopico(
        @NotBlank
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String curso
) {
}
