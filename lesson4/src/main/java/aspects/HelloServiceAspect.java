package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

//    @Before("execution(* services.HelloService.hello(..))")
//    public void before(){
//        System.out.println("A");
//    }
//
//    @After("execution(* services.HelloService.hello(..))")
//    public void after(){
//        System.out.println("B");
//    }
//
//    @AfterReturning("execution(* services.HelloService.hello(..))")
//    public void afterReturning(){
//        System.out.println("C");
//    }
//
//    @AfterThrowing("execution(* services.HelloService.hello(..))")
//    public void afterThrowing(){
//        System.out.println("D");
//    }
    @Around("execution(* services.HelloService.hello(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        return joinPoint.proceed(); // this method will call the actual implementation that of HelloService.hello()
//        return joinPoint.proceed(new Object[]{"George"}); // this method will call the actual implementation that of HelloService.hello() with different params
//        joinPoint.getArgs() // will return the original parameters
//        joinPoint.getSignature();
        System.out.println("Something else");
        return "Something else:)";
    }
}
