package challenge.forohub.api.topico;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosListadoTopico(
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

    public DatosListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getEstadoTopico(), topico.getAutor(), topico.getCurso());
    }
}
