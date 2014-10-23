import java.util.Scanner;

public class GradeAndScheduleChanger
	{
	static String newGrade;
	static int sureChoice, studentNumber, gradeChoice, studentChoice, replaceChoice, replaceWithChoice;
	
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
		System.out.println("Type the ID of that classmate.");		
		studentNumber = 1;
		for(Student s : Submenus.roster)
			{
			System.out.println("ID:" + studentNumber + ": " + s.getFirstName() + " " + s.getLastName() + ">>> " + s.getPeriodOne() + ": " + s.getPeriodOneGrade() + "| " + s.getPeriodTwo() + ": " + s.getPeriodTwoGrade() + "| " + s.getPeriodThree() + ": " + s.getPeriodThreeGrade() + "|");			
			studentNumber++;
			}
		System.out.println();
		Scanner userInput1 = new Scanner(System.in);
		studentNumber = userInput1.nextInt();
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
		
	public static void alterGrade()//done
		{
		System.out.println("Which grade do you want to alter?");
		System.out.println("   1) Period One Grade");
		System.out.println("   2) Period Two Grade");
		System.out.println("   3) Period Three Grade");		
		System.out.println("ID:" + studentNumber + ": " + Submenus.roster.get(studentNumber - 1).getFirstName() + " " + Submenus.roster.get(studentNumber - 1).getLastName() + ">>> " + Submenus.roster.get(studentNumber - 1).getPeriodOne() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodOneGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodTwo() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodTwoGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodThree() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodThreeGrade() + "|");
		System.out.println();
		Scanner userInput1 = new Scanner(System.in);
		gradeChoice = userInput1.nextInt();
		System.out.println("What do you want to change the grade to?");
		Scanner userInput2 = new Scanner(System.in);
		newGrade = userInput2.nextLine();
		switch(gradeChoice)
			{
			case 1:
				{
				Submenus.roster.get(studentNumber - 1).setPeriodOneGrade(newGrade);
				break;
				}
			case 2:
				{
				Submenus.roster.get(studentNumber - 1).setPeriodTwoGrade(newGrade);
				break;
				}
			case 3:
				{
				Submenus.roster.get(studentNumber - 1).setPeriodThreeGrade(newGrade);
				break;
				}				
			}
		System.out.println("ID:" + studentNumber + ": " + Submenus.roster.get(studentNumber - 1).getFirstName() + " " + Submenus.roster.get(studentNumber - 1).getLastName() + ">>> " + Submenus.roster.get(studentNumber - 1).getPeriodOne() + ": " + s.getPeriodOneGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodTwo() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodTwoGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodThree() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodThreeGrade() + "|");
		}
	
	public static void alterSchedule()
		{
		System.out.println("Which period do you want to replace?");
		System.out.println("   1) Period One");
		System.out.println("   2) Period Two");
		System.out.println("   3) Period Three");		
		System.out.println("ID:" + studentNumber + ": " + Submenus.roster.get(studentNumber - 1).getFirstName() + " " + Submenus.roster.get(studentNumber - 1).getLastName() + ">>> " + Submenus.roster.get(studentNumber - 1).getPeriodOne() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodOneGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodTwo() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodTwoGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodThree() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodThreeGrade() + "|");
		System.out.println();
		Scanner userInput1 = new Scanner(System.in);
		replaceChoice = userInput1.nextInt();
		System.out.println("What do you want to replace it with?");
		System.out.println("   1) Period One");
		System.out.println("   2) Period Two");
		System.out.println("   3) Period Three");		
		Scanner userInput2 = new Scanner(System.in);
		replaceWithChoice = userInput2.nextInt();
		switch(replaceChoice)
			{
			case 1:
				{
				switch(replaceWithChoice)
					{
					case 2:
						{
						Submenus.roster.get(studentNumber - 1).setPeriodOne(Submenus.roster.get(studentNumber - 1).getPeriodTwo());
						Submenus.roster.get(studentNumber - 1).setPeriodTwo(Submenus.roster.get(studentNumber - 1).getPeriodOne());
						break;
						}
					case 3:
						{
						Submenus.roster.get(studentNumber - 1).setPeriodOne(Submenus.roster.get(studentNumber - 1).getPeriodThree());
						Submenus.roster.get(studentNumber - 1).setPeriodThree(Submenus.roster.get(studentNumber - 1).getPeriodOne());
						break;
						}
					}
				break;
				}
			case 2:
				{
				switch(replaceWithChoice)
					{
					case 1:
						{
						Submenus.roster.get(studentNumber - 1).setPeriodTwo(Submenus.roster.get(studentNumber - 1).getPeriodOne());
						Submenus.roster.get(studentNumber - 1).setPeriodOne(Submenus.roster.get(studentNumber - 1).getPeriodTwo());
						break;
						}
					case 3:
						{
						Submenus.roster.get(studentNumber - 1).setPeriodTwo(Submenus.roster.get(studentNumber - 1).getPeriodThree());
						Submenus.roster.get(studentNumber - 1).setPeriodThree(Submenus.roster.get(studentNumber - 1).getPeriodTwo());
						break;
						}
					break;
					}
				}
			case 3:
				{
				switch(replaceWithChoice)
					{
					case 1:
						{
						Submenus.roster.get(studentNumber - 1).setPeriodThree(Submenus.roster.get(studentNumber - 1).getPeriodTwo());
						Submenus.roster.get(studentNumber - 1).setPeriodTwo(Submenus.roster.get(studentNumber - 1).getPeriodThree());
						break;
						}
					case 2:
						{
						Submenus.roster.get(studentNumber - 1).setPeriodThree(Submenus.roster.get(studentNumber - 1).getPeriodTwo());
						Submenus.roster.get(studentNumber - 1).setPeriodTwo(Submenus.roster.get(studentNumber - 1).getPeriodThree());
						break;
						}
					break;
					}	
				}
			}
		System.out.println("ID:" + studentNumber + ": " + Submenus.roster.get(studentNumber - 1).getFirstName() + " " + Submenus.roster.get(studentNumber - 1).getLastName() + ">>> " + Submenus.roster.get(studentNumber - 1).getPeriodOne() + ": " + s.getPeriodOneGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodTwo() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodTwoGrade() + "| " + Submenus.roster.get(studentNumber - 1).getPeriodThree() + ": " + Submenus.roster.get(studentNumber - 1).getPeriodThreeGrade() + "|");
		}
	}
