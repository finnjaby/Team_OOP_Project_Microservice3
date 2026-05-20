package ie.atu.team_oop_project_microservice3.Controller;

import ie.atu.team_oop_project_microservice3.Model.SwimPhoto;
import ie.atu.team_oop_project_microservice3.Service.PhotoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    private final PhotoService photoService;
    public PhotoController(PhotoService photoService) {
        this.photoService = photoService;
    }

    @PostMapping
    public SwimPhoto savePhoto(@Valid @RequestBody SwimPhoto swimPhoto) {
        return photoService.createPhoto(swimPhoto);
    }

    @GetMapping
    public List<SwimPhoto> getAllPhotos() {
        return photoService.getAllPhotos();
    }

    @GetMapping
    public SwimPhoto getPhotoById(@Valid @PathVariable int id) {
        return photoService.getPhotoById(id);
    }

    @DeleteMapping
    public void deletePhotoById(@Valid @PathVariable int id) {
        photoService.deletePhoto(id);
    }
}
