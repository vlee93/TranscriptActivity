public class CourseEnrollment {

//Testing Comment
	
	// second comment

	private String coursecode, grade;
	private double credits, qualitypoints;
	
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	public double getQualitypoints() {
		return qualitypoints;
	}
	public void setQualitypoints() {

		if (grade.equalsIgnoreCase("A"))
		{
			qualitypoints = 4.0;
		}
		else if (grade.equalsIgnoreCase("B"))
		{
			qualitypoints = 3.0;
		}
		else if (grade.equalsIgnoreCase("C"))
		{
			qualitypoints = 2.0;
		}
		else if (grade.equalsIgnoreCase("D"))
		{
			qualitypoints = 1.0;
		}
		else
		{
			qualitypoints = 0.0;
		}
	}

}
