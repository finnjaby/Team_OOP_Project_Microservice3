package ie.atu.team_oop_project_microservice3.Feign;

import ie.atu.team_oop_project_microservice3.DTO.SwimmerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "swimmerService",
        url = "http://localhost:8080"
)
public interface SwimmerClient {
    @GetMapping("/profiles/{id}")
    SwimmerDTO getSwimmerById(
            @PathVariable int id
    );
}
