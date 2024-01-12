package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
//    @Transactional (rollbackFor = Exception.class)  //- it will rollback for any checked Exception
//    @Transactional(noRollbackFor = RuntimeException.class) - it will change the default behaviour
//    @Transactional //rolles back the RUntimeExceptions, but doesn't rollback checked Exceptions.
    public void addOneProduct() throws Exception {
        productRepository.addProduct("Beer");
        throw new Exception(":(");
    }


    @Transactional
    public void addOneProduct1() throws Exception {
        productRepository.addProduct("Beer");
        try{

            throw new RuntimeException(":(");
        } catch (RuntimeException r){
            r.printStackTrace();
        }
        //this kind of method will not rollback the transaction... because the error is not thrown outside of the method.
    }




}
