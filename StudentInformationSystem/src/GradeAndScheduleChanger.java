import java.util.Scanner;

public class GradeAndScheduleChanger
	{
	static String newGrade;
	static int sureChoice;
	
	public static void changeGrade()
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
			System.out.println("What do you want to change the grade to?");
			//sets grade to newGrade
			askIfSure();
			}
		}
	
	public static void changeSchedule()
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
			System.out.println("What do you want to change the grade to?");
			
			askIfSure();
			}
		}
	
	public static void chooseStudent()
		{
		for(ArrayList s : Submenus.Roster)
			{
			
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
		
	}
