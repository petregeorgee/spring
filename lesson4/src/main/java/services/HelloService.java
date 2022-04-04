package services;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello(String name ){
        String value = "HELLO, " + name + "!";
        System.out.println(value);
//        throw new RuntimeException();

        return value;
    }
}
