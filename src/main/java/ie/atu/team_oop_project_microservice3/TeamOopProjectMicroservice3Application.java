package ie.atu.team_oop_project_microservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TeamOopProjectMicroservice3Application {

    public static void main(String[] args) {
        SpringApplication.run(TeamOopProjectMicroservice3Application.class, args);
    }

}
