package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {
    /**
     * REQUIRED (default)
     * requires_new
     * mandatory
     * never
     * suports
     * not_supported
     * nested
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional 
    public void addTenProducts(){
        for(int i=1; i<10;i++){
            productRepository.addProduct("Beer "+i);
            if(i==5)
                throw new RuntimeException(":(");
        }
    }
}
