import java.util.ArrayList;

public class DoctoralStudents extends Students implements IStudents,IGraduateStudents
{
	private String name;
	private String number;
	private int year;
	private String term;
	private int id;
	private int numCourses;

	public DoctoralStudents(String name,String number,int year)
	{
		super(name,number,year);
		//TODO Auto-generated method stub
	}
	

	public void showDegree()
	{
		System.out.println(getName() + " is a doctoral student");
	}
	
	public void gpa()
	{
		//TODO Auto-generated method stub
	}
	
	public void numberOfCourses()
	{
		//TODO Auto-generated method stub
	}
	
	
	
	public void kalanDersSayısı()
	{
		if(courses.size()<8)
	    {
		   System.out.println(getName() + " needs to take " + (8-courses.size()) + " courses to take");
		}
		else
		{
		   System.out.println(getName() + " took enough courses to graduate");
	    }
	}
	
	
	/*
	public void dersEkle(Courses course) {

		if(courses.contains(course))
		{
			System.out.println("Bu kurs zaten ekli!!!!");
		}
		else
		{
			courses.add((GraduateCourses)course);
			setNumCourses1(getNumCourses1()+1);
			//course.setStudents(student);
		}
		
	}
	*/
	
}
