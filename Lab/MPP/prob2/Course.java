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

}
