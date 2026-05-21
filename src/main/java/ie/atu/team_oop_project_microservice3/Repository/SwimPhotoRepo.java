package ie.atu.team_oop_project_microservice3.Repository;

import ie.atu.team_oop_project_microservice3.Model.SwimPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwimPhotoRepo  extends JpaRepository<SwimPhoto, Integer> {

}
