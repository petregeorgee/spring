package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {
    /**
     * DEFAULT ---> read commited (IT WILL BE THE ONE FROM THE UNDERLAYER
     * READ_UNCOMMITTED
     * READ_COMMITED
     * REPEATABLE_READ
     * SERIALIZABLE
     *
     * PROBLEMS:
     *  - dirty reads
     *
     *
     *  t1 ----10-----------------20------------------> 20
     *  t2 ----------20-----------------------rollback------> 10 ????
     *  this problem will be resolved by READ_COMMITED - but it will affect the performance
     *  - repeatable reads
     *     *  t1 ----10-----------------20------------------> 20
     *      *  t2 ----------20--Commit--------------------------> 10 ????
     *      resolved by REPEATABLE_READ
     *  - phantom reads
     *      resolved by SERIALIZABLE
     *
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional (isolation = Isolation.READ_COMMITTED)
    public void addTenProducts(){
        for(int i=1; i<10;i++){
            productRepository.addProduct("Beer "+i);
            if(i==5)
                throw new RuntimeException(":(");
        }
    }
}
