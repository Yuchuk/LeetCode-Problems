package prob2;

public class TranscriptEntry {
    private LocalDate dateTaken;
    private String grade;
    private Course course;

    public void TranscriptEntry(LocalDate dateTaken, String grade, Course course){
        this.dateTaken = dateTaken;
        this.grade = grade;
        this.course = course;
    }
    public LocalDate getDateTaken() {
        return dateTaken;
    }
    public String getGrade(){
        return grade;
    }
    public Course getCourse(){
        return course;
    }
    public void setDateTaken(LocalDate dateTaken){
        this.dateTaken = dateTaken;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setCourse(Course course){
        this.course = course;
    }
}
