package challenge.forohub.api.topico;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicoService {
    private List<Topico> topicosLista = new ArrayList<>();
    private TopicoRepository topicoRepositorio;

    public TopicoService(TopicoRepository topicoRepositorio) {
        this.topicoRepositorio = topicoRepositorio;
    }

    public List<Topico> getTopicosLista() {
        topicosLista = topicoRepositorio.findAll();
        return topicosLista;
    }

    public Topico buscarTopicoByID(Long id){
        topicosLista =  getTopicosLista();
        topicosLista.forEach(System.out::println);
        if (topicosLista.isEmpty()) {
            return null;
        }
        for (Topico topico : topicosLista) {
            if (topico.getId().equals(id)) {
                return topico;
            }
        }return null;
}
    public void actualizarDatos(ActulizaTopico actualizaTopico, Topico topicoEnBase) throws ValidarNoDuplicadoTopicoException {
        if (actualizaTopico.titulo()!= null){
            if (actualizaTopico.titulo().equals(topicoEnBase.getTitulo().toString())){
               throw new ValidarNoDuplicadoTopicoException("No datos guardados, los datos ya estan en la base de datos");
            }else{
                topicoEnBase.setTitulo(actualizaTopico.titulo());
            }}
        if (actualizaTopico.mensaje()!= null) {
            if (actualizaTopico.mensaje().equals(topicoEnBase.getMensaje().toString())){
                throw new ValidarNoDuplicadoTopicoException("No datos guardados, los datos ya estan en la base de datos");
            }else{
                topicoEnBase.setMensaje(actualizaTopico.mensaje());
            }}
        if (actualizaTopico.curso() != null) {
            if (actualizaTopico.curso().equals(topicoEnBase.getCurso().toString())){
                throw new ValidarNoDuplicadoTopicoException("No datos guardados, los datos ya estan en la base de datos");
            }else{
                topicoEnBase.setCurso(actualizaTopico.curso());
            }}

    }
}
