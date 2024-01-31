package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjection implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hey I'm Setting a Greeting";
    }
}
