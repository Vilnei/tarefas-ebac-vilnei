package br.com.vilnei.eventos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServicoEnvioMensagensKafka {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.ebac.nome.topico}")
    private String nomeTopicoEbac;

    public void enviarMensagem (String mensagem) {
        kafkaTemplate.send(nomeTopicoEbac, mensagem);
    }

}
