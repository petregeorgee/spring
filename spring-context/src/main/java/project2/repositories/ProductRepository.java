package project2.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component - replace by @Repository
@Repository
public class ProductRepository {

    public void add(){
        System.out.println("a new product was added");
    }

}
