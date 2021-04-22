package guru.springfrm.spring5jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5JokesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Spring5JokesApplication.class, args);
		//System.out.println(ctx.getBean(JokeServiceImpl.class));
	}

}
