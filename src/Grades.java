public class Grades 
{
	private int midterm;
	private int final_exam;
	private double average;
	
	public Grades(int midterm,int final_exam,double average)
	{
		this.midterm=midterm;
		this.final_exam=final_exam;
		this.average=average;
	}
	
	public void setMidterm(int midterm)
	{
		this.midterm=midterm;
	}
	public int getMidterm()
	{
		return midterm;
	}
	public void setFinal_exam(int final_exam)
	{
		this.final_exam=final_exam;
	}
	public int getFinal_exam()
	{
		return final_exam;
	}
	public void setAverage(double average)
	{
		this.average=average;
	}
	public double getAverage()
	{
		return average;
	}
	
	
	
}


