import java.util.Scanner;

public class MainMenu
	{
	static String option1;
	public static void main(String[] args)
		{
		Firstquestion();
		Secondquestion();
		Thirdquestion();

		}

	public static void Firstquestion()
		{
		System.out.println("What would you like to do? \n 1) Add or delete a student \n 2) Change a Student's grades or schedule \n 3) Sort students" );
		Scanner userInput1 = new Scanner(System.in);
		option1 = userInput1.nextLine();
		if(option1.equals("1"))
			{
			
			}
		}

	public static void Secondquestion()
		{
		System.out.println("Would you prefer to \n 1) Add a student \n 2) Delete a student");
		
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
