package ie.atu.team_oop_project_microservice3.DTO;

public class SwimmerDTO {

    private int swimmerId;
    public String name;
    public boolean medClearance;
    public boolean memberStatus;

    public SwimmerDTO(){}

        public int getSwimmerId(){
            return swimmerId;
        }
        public String getName(){
            return name;
        }
        public boolean getMedClearance() {
            return medClearance;
        }
        public boolean getMemberStatus() {
            return memberStatus;
        }

}
