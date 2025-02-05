package br.com.vilnei.eventos.produtor;

import br.com.vilnei.eventos.servico.ServicoEnvioMensagensKafka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutorControler {
    @Autowired
    private ServicoEnvioMensagensKafka servicoEnvioMensagensKafka;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem) {
        servicoEnvioMensagensKafka.enviarMensagem(mensagem);

    }

}
