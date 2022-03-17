package project1.beans;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

//@Component // same thing as @Repository ( for the moment)
@Repository
public class MyBean {

    private String text;

    @PostConstruct //workaround for having a not null instance of MyBean; not needed you you use @Bean in ProjectConfig
    private void init(){
        this.text = "Asdasd";
    }

    /**
     * difference between @Component/@Repository + @PostConstruct + @ComponentScan ( at the ProjectConfig) is that with this one you can have only 1 instances of MyBean
     * with @Bean / @Bean("A") / @Primary - you can have as many as you need.
     * @PostConstruct will work only for objects managed by spring context.
     * @return
     */

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
