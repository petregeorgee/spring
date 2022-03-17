package project1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "project1/beans")
public class ProjectConfig {

//    @Bean("A")
//    public MyBean myBean1(){
//        MyBean myBean =  new MyBean();
//
//        myBean.setText("hello");
//        return myBean;
//    }
//
//    @Bean("B")
//    @Primary
//    public MyBean myBean2(){
//        MyBean myBean =  new MyBean();
//
//        myBean.setText("World");
//        return myBean;
//    }

}
