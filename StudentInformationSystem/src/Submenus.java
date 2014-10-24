import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Submenus
	{
	/*
	 * ArrayList that is to be filled with all of the students.
	 */
	static ArrayList <Student> roster = new ArrayList<Student>();
	static int addOrDelete,studentToDelete;
	static int  studentNumber = 1;
	static int confirmDelete;
	static String firstName,  lastName, firstPeriod, firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade;
	
	
	public static void runSubmenus() throws FileNotFoundException
		{
		
		
		System.out.println("Would you like to :");
		System.out.println("1) Add a student");
		System.out.println("2) Remove a student");
		System.out.println("3) Return to main menu");
		
		Scanner userInput = new Scanner(System.in);
		addOrDelete = userInput.nextInt();
		
		switch(addOrDelete)
			{
			case 1:
				{
				addStudent();
				break;
				}
			case 2:
				{
				deleteStudent();
				break;
				}
			case 3:
				{

				MainMenu.Firstquestion();
				break;
				}
			}
		}
	/*
	 * This method will add the students from the .txt file to the roster ArrayList.
	 */
	public static void addToRoster() throws FileNotFoundException
		{
		Scanner file = new Scanner (new File ("studentlist.txt"));
		
		while(file.hasNext())
			{
			roster.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next()));
			}
		}
	/*
	 * This method will allow the user to manually enter a student into the roster.
	 */
	public static void addStudent() throws FileNotFoundException
		{
		System.out.println("First name :");
		Scanner userInput = new Scanner (System.in);
		firstName = userInput.nextLine();
		
		System.out.println("Last name :");
		lastName = userInput.nextLine();
		
		System.out.println("First period class :");
		firstPeriod = userInput.nextLine();
		
		System.out.println("First period grade :");
		firstPeriodGrade = userInput.nextLine();
		
		System.out.println("Second period class :");
		secondPeriod = userInput.nextLine();
		
		System.out.println("Second period grade :");
		secondPeriodGrade = userInput.nextLine();
		
		System.out.println("Third period class :");
		thirdPeriod = userInput.nextLine();
		
		System.out.println("Third period grade :");
		thirdPeriodGrade = userInput.nextLine();
		
		roster.add(new Student(firstName, lastName, firstPeriod, firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade));
		
		System.out.println("Here is the new class roster :");
		
		studentNumber = 1;
		for(Student s : Submenus.roster)
			{
			System.out.println("ID:  " + studentNumber + ":  " + s.getFirstName() + "   " + s.getLastName() + "   " + s.getPeriodOne() + ":  " + s.getPeriodOneGrade() + "  |  " + s.getPeriodTwo() + ":  " + s.getPeriodTwoGrade() + "  |  " + s.getPeriodThree() + ":  " + s.getPeriodThreeGrade() + "  |");			
			studentNumber++;
			}
		
		
		
		
		}
	
	
	/*
	 * This method will delete all the information of a chosen student.
	 * It will print the entire roster and give each student a number
	 * the number the user inputs will be the student that is deleted.
	 */
	public static void deleteStudent() throws FileNotFoundException
		{
		
		studentNumber = 0;
		for(Student s : Submenus.roster)
			{
			System.out.println("ID:  " + studentNumber + ":  " + s.getFirstName() + "   " + s.getLastName() + "   " + s.getPeriodOne() + ":  " + s.getPeriodOneGrade() + "  |  " + s.getPeriodTwo() + ":  " + s.getPeriodTwoGrade() + "  |  " + s.getPeriodThree() + ":  " + s.getPeriodThreeGrade() + "  |");			
			studentNumber++;
			}
		
		Scanner userInput = new Scanner(System.in);
		studentToDelete = userInput.nextInt();
		
		
		System.out.println("Are you sure you would like to delete " + roster.get(studentToDelete - 1).getFirstName());
		System.out.println("1) Yes");
		System.out.println("2) No ");
		
		Scanner userInput2 = new Scanner (System.in);
		confirmDelete = userInput2.nextInt();
		
		
		switch(confirmDelete)
			{
			case 1:
				{
				roster.remove(studentToDelete - 1);
				System.out.println("\nThe student was successfully deleted, here is the new roster : ");
				
				studentNumber = 1;
				for(Student s : Submenus.roster)
					{
					System.out.println("ID:  " + studentNumber + ":  " + s.getFirstName() + "   " + s.getLastName() + "   " + s.getPeriodOne() + ":  " + s.getPeriodOneGrade() + "  |  " + s.getPeriodTwo() + ":  " + s.getPeriodTwoGrade() + "  |  " + s.getPeriodThree() + ":  " + s.getPeriodThreeGrade() + "  |");			
					studentNumber++;
					}
				
				MainMenu.Firstquestion();
				break;
				}
			case 2:
				{
				deleteStudent();
				break;
				}
			}
		 
		}
	}
	