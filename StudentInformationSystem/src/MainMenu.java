import java.util.Scanner;

public class MainMenu
	{
	static String option1, addOrDelete, change, sort;
	public static void main(String[] args)
		{
		Firstquestion();
		Thirdquestion();

		}

	public static void Firstquestion()
		{
		System.out.println("What would you like to do? \n 1) Add or delete a student \n 2) Change a Student's grades or schedule \n 3) Sort students" );
		Scanner userInput1 = new Scanner(System.in);
		option1 = userInput1.nextLine();
		if(option1.equals("1"))
			{
			System.out.println("Would you prefer to: \n 1) Add a student \n 2) Delete a student");
			Scanner userInput2 = new Scanner(System.in);
			addOrDelete = userInput2.nextLine();
			if(addOrDelete.equals("1"))
			{
				//Chris' method to add a student
			}
			if(addOrDelete.equals("2"))
			{
				//Chris' method to delete a student
			}
			}
		if(option1.equals("2"))
			{
			System.out.println("Would you prefer to: \n 1) Change a student's schedule \n 2) Change a student's grade");
			Scanner userInput3 = new Scanner(System.in);
			change = userInput1.nextLine();
			if(change.equals(1))
			{
				//Nathan's method to change a students schedule
			}
			if(change.equals(2))
			{
				//Nathan's method to change a students grade
			}
			}
		if(option1.equals("3"))
		{
			System.out.println("Would you prefer to sort the students by: \n 1) Last Name \n 2) GPA \n 3) Class");
			Scanner userInput3 = new Scanner(System.in);
			sort = userInput1.nextLine();
			if(sort.equals("1"))
			{
				//SortByLastName
			}
			if(sort.equals("2"))
			{
				//SortByGPA
			}
			if(sort.equals("3"))
			{
				//SortByClass
			}
		}
		}

	public static void Thirdquestion()
		{
		System.out.println("");
		
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
