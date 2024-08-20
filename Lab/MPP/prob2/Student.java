package prob2;

public class Student {
    private String firstName;
    private String lastName;
    private Transcript transcript;
    private PlanOfStudy planOfStudy;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Transcript getTranscript(){
        return transcript;
    }

    public PlanOfStudy getPlanOfStudy() {
        return planOfStudy;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setTranscript(Transcript transcript){
        this.transcript = transcript;
    }
    public void setPlanOfStudy(PlanOfStudy planOfStudy){
        this.planOfStudy = planOfStudy;
    }
}
