import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

public class MainMenu
	{
	static String option1, addOrDelete, change, sort;
	public static void main(String[] args) throws FileNotFoundException
		{
		while(true)
			{
		Submenus.addToRoster();
		Firstquestion();
			}
		}

	public static void Firstquestion() throws FileNotFoundException
		{
		System.out.println("What would you like to do? \n 1) Add or delete a student \n 2) Change a Student's grades or schedule \n 3) Sort students" );
		Scanner userInput1 = new Scanner(System.in);
		option1 = userInput1.nextLine();
		if(option1.equals("1"))
			{
				Submenus.runSubmenus();
			}			
		if(option1.equals("2"))
			{
			System.out.println("Would you prefer to: \n 1) Change a student's schedule \n 2) Change a student's grade");
			Scanner userInput2 = new Scanner(System.in);
			change = userInput2.nextLine();
			if(change.equals("1"))
			{
				GradeAndScheduleChanger.changeSchedule();
			}
			if(change.equals("2"))
			{
				GradeAndScheduleChanger.changeGrade();
			}
			}
		if(option1.equals("3"))
		{
			System.out.println("Would you prefer to sort the students by: \n 1) Last Name \n 2) GPA \n 3) Class");
			Scanner userInput3 = new Scanner(System.in);
			sort = userInput3.nextLine();
			if(sort.equals("1"))
			{
				Collections.sort(Submenus.roster, new SortByLastName());
				System.out.println(Submenus.roster);
			}
			else if(sort.equals("2"))
			{
				//Collections.sort(Submenus.roster, new SortByGPA());
			}
			else if(sort.equals("3"))
			{
				Collections.sort(Submenus.roster, new SortByClass());
				
			}
			else
				{
				
				}
		}
		}

	}
//main menus: Menu Class
//input, methods

//sort students: 
//look at sort code from previous project. 
//3 classes:
//last name 
//GPA 
//classes

//Chris has constructor and submenus
//Nathan has Change student grades and Schedule
