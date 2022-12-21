import java.util.ArrayList;

public class MasterStudents extends Students implements IStudents, IGraduateStudents
{ 
	private String name;
	private String number;
	private int year;
	private String term;
	private int id;

	public MasterStudents(String name,String number,int year)
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
		System.out.println(getName() + " is a master student");
	}
	
	public void kalanDersSayısı()
	{
		if(courses.size()<7)
		{
			System.out.println(getName() + " needs to take " + (7-courses.size() + " courses to graduate"));
		}
		else
		{
			System.out.println(getName() + "  enough courses to graduate.");
		}
	}
	
	/*
	public void dersEkle(Courses course)
	{
		if(courses.contains(course))
		{
			System.out.println("This course has already been added!");
		}
		else
		{
			courses.add((GraduateCourses)course);
			setNumCourses1(getNumCourses1()+1);
		}
	} 
	*/
	
}
