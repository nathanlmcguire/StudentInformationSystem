public class Student
	
	{
	private String firstName;
	private String lastName;
	private String periodOne;
	private String periodOneGrade;
	private String periodTwo;
	private String periodTwoGrade;
	private String periodThree;
	private String periodThreeGrade;
	private Double gradePointAverage;
	
	public Student (String fn, String ln, String p1, String p1g, String p2, String p2g, String p3, String p3g, Double g)
		{
		firstName = fn;
		lastName = ln;
		periodOne = p1;
		periodOneGrade = p1g; 
		periodTwo = p2;
		periodTwoGrade =p2g; 
		periodThree = p3;
		periodThreeGrade = p3g;
		gradePointAverage = g;
		}

	

	/*
	 * Not sure if all of these setters are needed in Nathans class.
	 */
	public String getFirstName()
		{
		return firstName;
		}
	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}
	public String getLastName()
		{
		return lastName;
		}
	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}
	public String getPeriodOne()
		{
		return periodOne;
		}
	public void setPeriodOne(String periodOne)
		{
		this.periodOne = periodOne;
		}
	public String getPeriodOneGrade()
		{
		return periodOneGrade;
		}
	public void setPeriodOneGrade(String periodOneGrade)
		{
		this.periodOneGrade = periodOneGrade;
		}
	public String getPeriodTwo()
		{
		return periodTwo;
		}
	public void setPeriodTwo(String periodTwo)
		{
		this.periodTwo = periodTwo;
		}
	public String getPeriodTwoGrade()
		{
		return periodTwoGrade;
		}
	public void setPeriodTwoGrade(String periodTwoGrade)
		{
		this.periodTwoGrade = periodTwoGrade;
		}
	public String getPeriodThree()
		{
		return periodThree;
		}
	public void setPeriodThree(String periodThree)
		{
		this.periodThree = periodThree;
		}
	public String getPeriodThreeGrade()
		{
		return periodThreeGrade;
		}
	public void setPeriodThreeGrade(String periodThreeGrade)
		{
		this.periodThreeGrade = periodThreeGrade;
		}
	public Double getGradePointAverage()
		{
		return gradePointAverage;
		}
	public void setGradePointAverage(Double gradePointAverage)
		{
		this.gradePointAverage = gradePointAverage;
		}
	
	
	}