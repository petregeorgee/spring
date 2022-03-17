package project2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project2.repositories.ProductRepository;

@Component
public class ProductDeliveryService {

    @Autowired
    private ProductRepository productRepository;

    public void addSomeProducts(){
        productRepository.add();
        productRepository.add();
        productRepository.add();
        System.out.println("addSomeProducts");
    }
}
