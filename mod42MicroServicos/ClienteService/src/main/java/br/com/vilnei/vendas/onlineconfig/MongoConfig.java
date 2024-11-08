package br.com.vilnei.vendas.onlineconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.vilnei.vendas.online.repository")
public class MongoConfig {

}
