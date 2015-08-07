import java.util.ArrayList;

public class Transcript {

	private ArrayList<CourseEnrollment> transcript;
	
	public Transcript()
	{
		transcript = new ArrayList<CourseEnrollment>();
	}
	
	public void addItem (CourseEnrollment course)
	{
		transcript.add(course);
	}
	
	public ArrayList<CourseEnrollment> getTranscript()
	{
		return transcript;
	}
	
}
