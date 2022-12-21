import java.util.ArrayList;

public class UnderGraduateStudents extends Students implements IStudents,IGraduateStudents
{
	private String name;
	private String number;
	private int year;
	private int id;
	
	public UnderGraduateStudents(String name,String number,int year)
	{
		super(name,number,year);
		//TODO Auto-generated method stub  
	}
	
	public void gpa()
	{
		//TODO Auto-generated method stub
	}

	
	public void numberOfCourses()
	{
		 //TODO Auto-generated method stub
	}
	public void showDegree()
	{
		 //TODO Auto-generated method stub
	}
	
	public void kalanDersSayısı()
	{
		if(courses.size()<40)
		{
			System.out.println(getName() + " needs to take " + (40-courses.size() + " courses to graduate"));
		}
		else
		{
			System.out.println(getName() + " took enough courses to graduate");
		}
	}
	
	
	
	   
}
