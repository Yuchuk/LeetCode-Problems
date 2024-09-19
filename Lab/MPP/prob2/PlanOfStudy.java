package prob2;

public class PlanOfStudy {
    private List<Course> courseList = new ArrayList<>();

    public PlanOfStudy();

    public void addCourse(Course course){
        courseList.add(course);
    }
    public List<Course> getCourseList(){
        return courseList;
    }


}
