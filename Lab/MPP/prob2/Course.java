package prob2;

public class Course {
	String courseTitle;
	String primaryProfessor;

	@Override
	public void Course(String title, String professor){
		courseTitle = title;
		primaryProfessor = professor;
	}

	public String getCourseTitle {
		return courseTitle;
	}

	public String getPrimaryProfessor() {
		return primaryProfessor;
	}
	public void setCourseTitle(String courseTitle){
		this.courseTitle = courseTitle;
	}
	public void setPrimaryProfessor(String primaryProfessor){
		this.primaryProfessor = primaryProfessor;
	}

	public boolean equals(Course course){
		if(course.courseTitle.equals(courseTitle))
			return true;
		else
			return false;
	}
}
