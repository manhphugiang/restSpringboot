package giangma.ca.restspringboot;

import giangma.ca.beans.Employee;
import giangma.ca.controller.EmpController;
import giangma.ca.controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class RestSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestSpringbootApplication.class, args);
    }

}
