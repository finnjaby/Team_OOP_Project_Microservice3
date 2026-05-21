package ie.atu.team_oop_project_microservice3.Service;

import ie.atu.team_oop_project_microservice3.DTO.SwimmerDTO;
import ie.atu.team_oop_project_microservice3.Feign.SwimmerClient;
import ie.atu.team_oop_project_microservice3.Model.SwimPhoto;
import ie.atu.team_oop_project_microservice3.Repository.SwimPhotoRepo;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    private final SwimPhotoRepo swimPhotoRepo;
    private final SwimmerClient swimmerClient;

    public PhotoService(SwimPhotoRepo swimPhotoRepo, SwimmerClient swimmerClient) {
        this.swimPhotoRepo = swimPhotoRepo;
        this.swimmerClient = swimmerClient;

    }

    public SwimPhoto createPhoto(SwimPhoto photo) {
        SwimmerDTO swimmer = swimmerClient.getSwimmerById(
                photo.getSwimmerId());

        if (!swimmer.getMemberStatus()) {
            throw new RuntimeException("Inactive swimmers cannot have photos added");
        }
        return swimPhotoRepo.save(photo);
    }

    public List<SwimPhoto> getAllPhotos() {
        return swimPhotoRepo.findAll();
    }

    public SwimPhoto getPhotoById(int id) {
        return swimPhotoRepo.findById(id).orElseThrow(()-> new RuntimeException("Photo with id " + id + " not found"));
    }

    public void deletePhoto(int id) {
        SwimPhoto photo = swimPhotoRepo.findById(id).orElseThrow(()-> new RuntimeException("Photo with id " + id + " not found"));
        swimPhotoRepo.delete(photo);
    }
}