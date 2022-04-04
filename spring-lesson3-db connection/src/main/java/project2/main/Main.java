package project2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project2.config.ProjectConfig;
import project2.demo.HelloService;
import project2.demo.Person;

public class Main {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Person person = context.getBean(Person.class);

            person.sayHello("IOn");
        }
    }
}
