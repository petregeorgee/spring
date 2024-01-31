package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController
{

    private final GreetingService greetingService;

    public MyController()
    {
//        this.greetingService = greetingService;
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello()
    {
        System.out.println("I'm in the MyController class.");

        return greetingService.sayGreeting();
    }
}
