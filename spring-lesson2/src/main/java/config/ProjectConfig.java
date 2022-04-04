package config;
import beans.Cat;
import beans.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {

//    @Bean
//    public Cat cat(){
//        Cat cat = new Cat();
//        cat.setName("Tom");
//        return cat;
//    }
//
//    @Bean
////    @Autowired // required in old versions of spring (3.x)-
////    it is working but is not longer necessary
//    public Owner owner(Cat cat ){
//        Owner owner = new Owner();
//        owner.setCat(cat);
//        return owner;
//    }

//    @Bean //- this method also working
//    public Owner owner(){
//        Owner owner = new Owner();
//        owner.setCat(cat());
//        return owner;
//
//    }

    @Bean
    @Qualifier("cat1")
    public Cat cat1(){
        Cat cat = new Cat();
        cat. setName("Tom");
        return cat ;

    }


    @Bean
    @Primary
    @Qualifier("cat2")
    public Cat cat2(){
        Cat cat = new Cat();
        cat. setName("Leo");
        return cat;
    }
}
