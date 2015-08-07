import java.text.DecimalFormat;
import java.util.Scanner;

public class TranscriptApp {
	
public static void main(String[] args) {
	
	System.out.println("Welcome to the transcript application!");
	System.out.println();
	Scanner sc = new Scanner(System.in);
	String choice = "y";
	
	Transcript mytranscript = new Transcript();
	
	while (choice.equalsIgnoreCase("y"))
	{
		CourseEnrollment mycourseenrollment = new CourseEnrollment();
		String coursecode = Validator.getString(sc, "Enter course : ");
		mycourseenrollment.setCoursecode(coursecode);
		double credits = Validator.getDouble(sc, "Enter credits: ");
		mycourseenrollment.setCredits(credits);
		String grade = Validator.getString(sc, "Enter grade: ");
		mycourseenrollment.setGrade(grade);
		mycourseenrollment.setQualitypoints();

		
		choice = Validator.getString(sc, "Another course? (y/n): ");
		
		try
		{
			mytranscript.addItem(mycourseenrollment);
		}
		catch (NegativeArraySizeException e)
		{
			System.out.println("Error; " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error; " + e.getMessage());
		}
		catch (ArrayStoreException e)
		{
			System.out.println("Error; " + e.getMessage());
		}
	}
	
	System.out.println("------------------------------------------------------Transcript------------------------------------------------------");
	System.out.format("%-30s%-30s%-30s%-30s", "Course", "Credits", "Grade", "Quality Points");
	System.out.println();
	System.out.format("%-30s%-30s%-30s%-30s", "------", "-------", "-----", "--------------");
	System.out.println();
	
	double pointsum = 0;
	double arraycounter = 0;
	
	for (int i = 0; i < mytranscript.getTranscript().size(); i++)
	{
		System.out.format("%-30s%-30s%-30s%-30s",
				mytranscript.getTranscript().get(i).getCoursecode(),
				mytranscript.getTranscript().get(i).getCredits(),
				mytranscript.getTranscript().get(i).getGrade(),
				mytranscript.getTranscript().get(i).getQualitypoints());
				pointsum += mytranscript.getTranscript().get(i).getQualitypoints();
				arraycounter++;
		System.out.println();
	}
	
	System.out.println();
	System.out.println();
	
	double GPA = 0.0;
	
	try
	{
		GPA = pointsum / arraycounter;
		DecimalFormat df = new DecimalFormat();
	}
	catch (Exception e)
	{
		System.out.println("Error; " + e.getMessage());
	}
	finally
	{
		System.out.println("GPA calculation was attempted.");
	}
	
	
	System.out.format("%-90s%-5s", "", "GPA:  " + String.format("%.2f",GPA));
	
}

}
