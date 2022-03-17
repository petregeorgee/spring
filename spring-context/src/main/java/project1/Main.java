package project1;

import project1.beans.MyBean;
import project1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MyBean b1 = context.getBean(MyBean.class);
            MyBean b2 = context.getBean( MyBean.class);
//            MyBean b3 = context.getBean("A", MyBean.class);
            System.out.println(b1.getText());
            System.out.println(b2.getText());
//            System.out.println(b3.getText());
        }
    }
}
