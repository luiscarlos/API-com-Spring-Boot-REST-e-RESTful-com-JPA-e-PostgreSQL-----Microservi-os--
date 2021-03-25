package curso.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController/*arquitetura REST*/
@RequestMapping(value = "/usuario")
public class IndexController {
	
	/*serviço RESTful*/
	@GetMapping(value = "/", produces = "application/json")
	public ResponseEntity init(@RequestParam (value="nome",  required = true, defaultValue = "Nome obrigatorio") String nome) {
		System.out.println("Parametro sendo recebido " + nome);
		return new ResponseEntity("Ola usuario / spring boot seu nome e: " + nome, HttpStatus.OK);
	}
	

}
