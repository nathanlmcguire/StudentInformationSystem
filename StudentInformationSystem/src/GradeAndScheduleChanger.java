import java.util.Scanner;

public class GradeAndScheduleChanger
	{
	static String newGrade;
	static int sureChoice;
	
	public static void changeGrade()//Done
		{
		sureChoice = 0;
		while(sureChoice != 1)
			{
			System.out.println("Whose grade do you want to change?");
			chooseStudent();
			askIfSure();
			}
		sureChoice = 0;
		while(sureChoice != 1)
			{			
			alterGrade();
			askIfSure();
			}
		}
	
	public static void changeSchedule()//Done
		{
		sureChoice = 0;
		while(sureChoice != 1)
			{
			System.out.println("Whose schedule do you want to change?");
			chooseStudent();
			askIfSure();
			}
		sureChoice = 0;
		while(sureChoice != 1)
			{			
			alterSchedule();
			askIfSure();
			}
		}
	
	public static void chooseStudent()//done
		{
		for(Student s : Submenus.roster)
			{
			System.out.println(s.getFirstName() + " " + s.getLastName() + ">>> " + s.getPeriodOne() + ": " + s.getPeriodOneGrade() + "| " + s.getPeriodTwo() + ": " + s.getPeriodTwoGrade() + "| " + s.getPeriodThree() + ": " + s.getPeriodThreeGrade() + "|");			
			}
		}	
	
	public static void askIfSure()//done
		{
		System.out.println("Are you sure?");
		System.out.println("   1) Yes");
		System.out.println("   2) No");
		Scanner userInput1 = new Scanner(System.in);
		sureChoice = userInput1.nextInt();
		switch(sureChoice)
			{
			case 1:
				{
				System.out.println("Let's continue then.");
				break;
				}
			case 2:
				{
				break;
				}
			default:
				{
				System.out.println("ERROR!");
				break;
				}
			}
		
		}
		
	public static void alterGrade()
		{
		System.out.println("What do you want to change the grade to?");
		}
	
	public static void alterSchedule()
		{
		
		}
	}
