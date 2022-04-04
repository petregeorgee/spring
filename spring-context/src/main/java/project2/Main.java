package project2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project1.beans.MyBean;
import project2.config.ProjectConfig;
import project2.services.ProductDeliveryService;

public class Main {
    //https://www.youtube.com/watch?v=m-L-r862J-E&list=PLOk4ziGG9MBdlyxIDw5wYvj6QZTQ22wvK&ab_channel=LaurentiuSpilca
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductDeliveryService productDeliveryService = context.getBean(ProductDeliveryService.class);

            productDeliveryService.addSomeProducts();
        }
    }
}
