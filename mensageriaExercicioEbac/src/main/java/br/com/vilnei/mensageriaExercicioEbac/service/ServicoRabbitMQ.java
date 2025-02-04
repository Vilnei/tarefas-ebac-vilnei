package br.com.vilnei.mensageriaExercicioEbac.service;

import br.com.vilnei.mensageriaExercicioEbac.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoRabbitMQ {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarMensagem (String mensagem) {
        rabbitTemplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "ebac.rota.mensagem", mensagem);
    }
}
