package project2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project1.beans.MyBean;
import project2.config.ProjectConfig;
import project2.services.ProductDeliveryService;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductDeliveryService productDeliveryService = context.getBean(ProductDeliveryService.class);

            productDeliveryService.addSomeProducts();
        }
    }
}
