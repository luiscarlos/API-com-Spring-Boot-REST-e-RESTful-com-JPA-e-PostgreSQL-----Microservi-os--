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

@SpringBootApplication // dar start nos recursos 
@EntityScan(basePackages = {"curso.api.rest.model"})// cria as tabelas automaticas, le todas as classes desse pacote
@ComponentScan(basePackages = {"curso.*"})//pega tudo q estiver dentro de curso e configura automatico
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})// cuida do crud qual pasta vai ficar a interface de persistencia
@EnableTransactionManagement // controla as transaçoes
@EnableWebMvc// ativa o MVC mas pode trabalhar com rest 
@RestController// ele vai saber q vai usar rest
@EnableAutoConfiguration// para ativar todos as configuraçoes , todo projeto
public class CursospringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursospringrestapiApplication.class, args);
	}

}
