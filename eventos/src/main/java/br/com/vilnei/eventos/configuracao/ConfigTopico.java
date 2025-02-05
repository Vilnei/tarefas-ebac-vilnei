package br.com.vilnei.eventos.configuracao;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopico {

    @Value("${kafka.ebac.nome.topico}")
    private String nomeTopicoEbac;

    @Bean
    public NewTopic topicEbac () {
        return TopicBuilder.name(nomeTopicoEbac).partitions(2).replicas(1).build();
    }

}
