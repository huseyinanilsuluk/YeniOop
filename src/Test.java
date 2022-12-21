import java.util.ArrayList;
import java.util.List;

public class Test 
{
	public static void main(String[] args)
	{
		
		   List <Lecturer> lecturer=new ArrayList();
	       Lecturer lecturer1 = new Lecturer(1,"Uraz Yavanoğlu");
	       Lecturer lecturer2 = new Lecturer(2,"Öner Barut");
	       Lecturer lecturer3 = new Lecturer(3,"Hacer Karacan");
	       Secretary secretary1=new Secretary("Bilge Metin",1,"Secretary","08.30-17.30");
	      
	       List <Courses> course = new ArrayList();
	       GraduateCourses course1=new GraduateCourses("CENG213"," OOP", 6);
	       GraduateCourses course2=new GraduateCourses("CENG205"," Data Structures", 6);
	       GraduateCourses course3=new GraduateCourses("MATH201"," Differential Equations", 6);
	       GraduateCourses course4=new GraduateCourses ("BM312"," Bilgisayar Mimarisi", 6);
	       GraduateCourses course5=new GraduateCourses("BM222"," Sayısal Tasarım", 6);
	       GraduateCourses course6=new GraduateCourses("MATH203"," Mat1", 6);
	       GraduateCourses course7=new GraduateCourses("CENG416","ML",6);
	       GraduateCourses course8=new GraduateCourses("BM316"," Algoritmalar", 6);
	       GraduateCourses course9=new GraduateCourses("BM320"," Mat Modelleme", 6);
	       UnderGraduateCourses course10=new UnderGraduateCourses("BM320","Ağlar", 6);
	       
	       
	       List <Students> student=new ArrayList();
	       UnderGraduateStudents student1=new UnderGraduateStudents("Sueda Eren","201180082",2020);
	       UnderGraduateStudents student2=new UnderGraduateStudents("Aleyna İzgi","201180070",2020);
	       MasterStudents m1=new MasterStudents("Anıl Sülük", "161180053",2016);
	       DoctoralStudents ds1=new DoctoralStudents("Muhammet Akbulut","161180054",2016);
	       
	       Mentor mentor=new Mentor(1,"Murat");
	    
	       
	       
	       //added lecturer and print them
	       secretary1.addLecturer(lecturer1);
	       secretary1.addLecturer(lecturer2);
	       secretary1.addLecturer(lecturer3);
	   
	       secretary1.printLecturer();
	       
	       System.out.println();

	       
	       //courses list and print them 
	       course1.addCourse(course1);
	       course1.addCourse(course2);
	       course1.addCourse(course3);
	       
	       course1.printCourse();
	       
	       System.out.println();
	       
	       
	       //added student and print them
	       mentor.addStudent(student2);
	       mentor.addStudent(student1);
	       mentor.addStudent(m1);
	       mentor.addStudent(ds1);
	       
	       mentor.printStudent();
	       
	       System.out.println();
	       
	 
	       System.out.println("LECTURERS AND THEIR COURSES");
	       
	       //appoint courses to lecturers and print them
	       secretary1.addCourse(lecturer1, course1);
	       secretary1.addCourse(lecturer1, course2);
	       secretary1.addCourse(lecturer1, course3);
	       lecturer1.showCourses();
	       secretary1.addCourse(lecturer1, course3);
	       //try to appoint same course. give a warning
	       
	 
	       System.out.println();
	       
	       System.out.println("UPDATED");
	       secretary1.changeLecturer(course2,lecturer2);
	       lecturer1.showCourses();
	       lecturer2.showCourses();
	       System.out.println();
	       
	       
	       //appoint courses to students and print them 
	       mentor.addCourse(student2, course9);
	       mentor.addCourse(student2, course8);
	       mentor.addCourse(m1, course7);
	       mentor.addCourse(ds1, course7);
	       mentor.addCourse(ds1, course8);	
	       mentor.addCourse(ds1, course9);	
	       mentor.addCourse(m1, course9);
	       mentor.addCourse(student2, course7);
	       mentor.addCourse(student2, course10);
	       mentor.addCourse(m1, course10);
	       
	       
	       System.out.println("STUDENTS AND THEIR COURSES");
	       student2.showCourses();
	       m1.showCourses();
	       ds1.showCourses();
	       
	       System.out.println();
	       course9.printStudents();
	       
	       System.out.println();
	       
	       
	       m1.kalanDersSayısı();
	       
	       /*m1.courses.add(course4);
	       ds1.courses.add(course3);
	       ds1.courses.add(course5);
	       ds1.courses.add(course6);
	       ds1.courses.add(course7);
	       ds1.courses.add(course1);
	       ds1.courses.add(course2);
	       ds1.courses.add(course8);
	       ds1.courses.add(course4);
	       
	      
	       
	       //ds1.courses.add(course9);
	       //student1.courses.add(course2);
	       //m1.showCourses(;
	       
	       //ds1.showCourses();
	      // ds1.showDegree();
	       //m1.kalanDersSayısı();
	       //ds1.kalanDersSayısı();
	       
	       
	       
	       //Courses appointLecturer = secretary1.appointLecturer(course, lecturer);

		/*
		Mentor mentor = new Mentor(1,"Murat");
		List<Courses>course=new ArrayList();
		
		   GraduateCourses course1=new GraduateCourses("CENG213"," OOP", 6);
	       GraduateCourses course2=new GraduateCourses("CENG205"," Data Structures", 6);
	       GraduateCourses course3=new GraduateCourses("MATH201"," Differential Equations", 6);
	       GraduateCourses course4=new GraduateCourses ("BM312"," Bilgisayar Mimarisi", 6);
	       GraduateCourses course5=new GraduateCourses("BM222"," Sayısal Tasarım", 6);
	       GraduateCourses course6=new GraduateCourses("MATH203"," Mat1", 6);
	       GraduateCourses course8=new GraduateCourses("BM316"," Algoritmalar", 6);
	       GraduateCourses course9=new GraduateCourses("BM320"," Mat Modelleme", 6);
	       UnderGraduateCourses course10=new UnderGraduateCourses("BM320"," Mat Modelleme", 6);
	       
	       MasterStudents m1=new MasterStudents("Anıl Sülük", "161180053",2016);
		
	       mentor.addCourses(m1, course4);
	       m1.courses.add(course3);
	       m1.courses.add(course5);
	       m1.courses.add(course6);
	       mentor.addCourses(m1, course10);
	       m1.showCourses();
	       */
	       
	       
	}
}
