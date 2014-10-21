import java.util.Scanner;

public class MainMenu
	{
	static String option1, addOrDelete, change;
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
			}
		if(option1.equals("2"))
			{
			System.out.println("Would you prefer to: \n 1) Change a student's schedule \n 2) Change a student's grade");
			Scanner userInput3 = new Scanner(System.in);
			change = userInput1.nextLine();
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
