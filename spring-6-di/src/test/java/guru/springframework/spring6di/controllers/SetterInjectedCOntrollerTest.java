package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedCOntrollerTest
{

    SetterInjectedCOntroller setterInjectedCOntroller;


    @BeforeEach
    void setUp()
    {
        setterInjectedCOntroller = new SetterInjectedCOntroller();
        setterInjectedCOntroller.setGreetingService(new GreetingServiceImpl());
    }
    @Test
    void sayHello()
    {
        System.out.println(setterInjectedCOntroller.sayHello());
    }
}