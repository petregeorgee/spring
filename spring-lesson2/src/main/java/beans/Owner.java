package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    //beans are singleton
    //in spring context singleton means only one instance with a specific identifier
    //often beans are constants
@Autowired()
@Qualifier("cat1")
//@Autowired(required = false) // this will not be required for the Cat class to be annotated with @component. Not recommended
    private  Cat cat;

    public Cat getCat() {
        return cat;
    }

//    @Autowired // not recommended - it will be a smart setter ( clean code rule)
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "cat=" + cat +
                '}';
    }
}

//public class Owner {
//    //beans are singleton
//    //in spring context singleton means only one instance with a specific identifier
//    //often beans are constants
//
//    private final Cat cat;
//
//    @Autowired // -it is keeping the immutability of the cat instance.
//    public Owner(Cat cat) {
//        this.cat = cat;
//    }
//
//    public Cat getCat() {
//        return cat;
//    }
//
//    @Override
//    public String toString() {
//        return "Owner{" +
//                "cat=" + cat +
//                '}';
//    }
//}


//public class Owner {
//    //beans are singleton
//    //in spring context singleton means only one instance with a specific identifier
//    //often beans are constants
//
//    @Autowired
//    private Cat cat;
//
//    public Cat getCat() {
//        return cat;
//    }
//
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }
//
//    @Override
//    public String toString() {
//        return "Owner{" +
//                "cat=" + cat +
//                '}';
//    }
//}
