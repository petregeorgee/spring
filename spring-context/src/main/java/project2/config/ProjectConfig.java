package project2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

//@Configuration -replaced by service
@Service
@ComponentScan(basePackages = {"project2/services", "project2/repositories"})
public class ProjectConfig {


}
