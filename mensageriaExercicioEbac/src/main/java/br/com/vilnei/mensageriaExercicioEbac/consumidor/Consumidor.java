package br.com.vilnei.mensageriaExercicioEbac.consumidor;

import br.com.vilnei.mensageriaExercicioEbac.configuracao.ConfiguracaoRabbitMQ;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {
    @RabbitHandler
    public void consumirMensagem( String mensagem) {
        System.out.println("--- Recebendo Mensagem ---");
        System.out.println("--- " + mensagem);
        System.out.println("---Fim de Mensagem---");
    }
}
