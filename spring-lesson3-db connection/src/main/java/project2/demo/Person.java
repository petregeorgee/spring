package project2.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import project2.demo.HelloService;

@Component
public class Person {

    @Autowired
    @Qualifier("en")
    private HelloService helloService;

    public void sayHello(String name){
        System.out.println(helloService.sayHello(name));
    }
}
