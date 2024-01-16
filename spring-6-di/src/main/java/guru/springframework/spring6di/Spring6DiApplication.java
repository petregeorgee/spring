package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Spring6DiApplication.class, args);

		MyController myController = run.getBean(MyController.class);

		System.out.println("In main method. ");
		System.out.println(myController.sayHello());
	}

}
