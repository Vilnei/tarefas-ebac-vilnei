package br.com.vilnei.eventos.consumidor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumidor {

    @KafkaListener(topics = "${kafka.ebac.nome.topico}", groupId = "ebacGroup")
    public void consumirMensagem (String mensagem) {
        System.out.println("--- Recebendo Mensagem");
        System.out.println("--- " + mensagem);
        System.out.println("--- Fim de Mensagem");

    }

}
