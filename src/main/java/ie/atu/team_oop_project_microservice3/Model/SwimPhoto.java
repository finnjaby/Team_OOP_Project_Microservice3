package ie.atu.team_oop_project_microservice3.Model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class SwimPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photoId;

    @NotBlank(message="Photo name required")
    private String photoName;

    @NotBlank(message="Event name required")
    private String eventName;

    private int swimmerId;

    public int getPhotoId() {
        return photoId;
    }
    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }
    public String getPhotoName() {
        return photoName;
    }
    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public int getSwimmerId() {
        return swimmerId;
    }
    public void setSwimmerId(int swimmerId) {
        this.swimmerId = swimmerId;
    }

}
