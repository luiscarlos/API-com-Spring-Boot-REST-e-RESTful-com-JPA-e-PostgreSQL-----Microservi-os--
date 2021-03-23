package curso.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication //levantar o servidor e fazer as configurações necessarias 
@EntityScan(basePackages = {"curso.api.rest.model"})// le tudo o que estiver nesse pacote e cria as tabelas automaticamente
@ComponentScan(basePackages = {"curso.*"})// le tudo q estiver dentro da pasta de curso ele vai le e sair configurando 
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})// qual a pasta que vai ficar as interfaces de persistencia
@EnableTransactionManagement// controla as transaçes
@EnableWebMvc
@RestController
@EnableAutoConfiguration //pega todas as anotaçoes e configura
public class Cursospringrestapi1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cursospringrestapi1Application.class, args);
	}

}
