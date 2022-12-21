import java.util.ArrayList;

//import oop.GraduateCourses;
//import oop.UnderGraduate;

public class Mentor extends Lecturer 
{
	ArrayList<Students>studentList= new ArrayList<Students>();
	
	public Mentor(int id,String name)
	{
		super(id,name);
	}
	
	

	public Courses appointStudent(Courses course,MasterStudents student)
	{
		addCourse(student,course);
		//course.setStudents(student);
		return course;
	}
	
	public void addCourse(Students student,Courses course)
	{
	
		try {
			if(student.getClass().getName().equals("MasterStudents")) {
				student.courses.add((GraduateCourses)course);
				student.setNumCourses1(student.getNumCourses1()+1);
				course.students.add((MasterStudents)student);
				
			}
			else if(student.getClass().getName().equals("DoctoralStudents")) {
				student.courses.add((GraduateCourses)course);
				student.setNumCourses1(student.getNumCourses1()+1);
				course.students.add((DoctoralStudents)student);
			}
			else if(student.getClass().getName().equals("UnderGraduateStudents")) {
				student.courses.add((UnderGraduateCourses)course);
				student.setNumCourses1(student.getNumCourses1()+1);
				course.students.add((UnderGraduateStudents)student);
			}
		
		}
		catch(java.lang.ClassCastException e) {
			System.out.println(student.getName() + " için " + course.getName() + " geçersiz ders..");
		}
		
	}
	
	
	public void addStudent(Students student)
	{
		studentList.add(student);
	}


   public void printStudent()
   {
	   System.out.println("STUDENT LIST:");
	   for(int i=0;i<studentList.size();i++)
	   {
		   System.out.println(studentList.get(i));
	   }
   }
 	
}
