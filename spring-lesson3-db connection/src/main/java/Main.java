import repositories.ProductRepository;
import config.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try( var context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            ProductRepository productRepository = context.getBean(ProductRepository.class);

            Product product = new Product();
            product.setName("Fanta");
            product.setPrice(4);

            productRepository.addProduct(product);

            System.out.println(productRepository.getProducts());
        }
    }
}
