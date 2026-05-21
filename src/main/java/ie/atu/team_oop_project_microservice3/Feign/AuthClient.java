package ie.atu.team_oop_project_microservice3.Feign;

import ie.atu.team_oop_project_microservice3.DTO.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "auth-service",
        url = "http://localhost:8082"
)
public interface AuthClient {
    @GetMapping("/Signup/user/{id}")
    UserDTO getUserById(@PathVariable Long id);
}
