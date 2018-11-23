package aula.paulo.lopes.pt.inicial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InicialApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicialApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args->{
			System.out.println(" ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
			System.out.println(" APLICAÇÃO SPRING BOOT !!!!");
			System.out.println(" ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
		};
		
	}
}
