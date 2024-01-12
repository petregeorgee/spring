package main;


import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import services.ProductService;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        try(var c = new AnnotationConfigApplicationContext(ProjectConfig.class)){
//            var service = c.getBean(ProductService.class);
//            service.addTenProducts();//no tranzaction

            List<String> list = Stream.of("Monkey", "Lion", "Giraffe","Lemur")
                    .filter(s -> s.startsWith("L"))
                    .map(String::toUpperCase)
                    .sorted()
                    .collect(toList());

            System.out.println(list);
        }
    }
}
