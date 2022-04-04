package project2.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("es")
public class HelloServiceEs implements HelloService{
    @Override
    public String sayHello(String name) {
        return "Hola " + name +"!";
    }
}
