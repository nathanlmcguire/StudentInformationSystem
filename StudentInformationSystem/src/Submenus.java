import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Submenus
	{
	/*
	 * ArrayList that is to be filled with all of the students.
	 */
	static ArrayList <Student> roster = new ArrayList<Student>();
	static int addOrDelete;
	static String firstName,  lastName, firstPeriod, firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade;
	
	
	public static void runSubmenus()
		{
		System.out.println("Would you like to :");
		System.out.println("(1) Add a student");
		System.out.println("(2) Remove a student");
		
		Scanner userInput = new Scanner(System.in);
		addOrDelete = userInput.nextInt();
		
		switch(addOrDelete)
			{
			case 1:
				{
				addStudent();
				}
			case 2:
				{
				deleteStudent();
				}
			}
		}
	/*
	 * This method will add the students from the .txt file to the roster ArrayList.
	 */
	public static void addToRoster() throws FileNotFoundException
		{
		Scanner file = new Scanner (new File ("studentlist.txt"));
		
		while(file.hasNextLine())
			{
			roster.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next()));
			}
		}
	/*
	 * This method will allow the user to manually enter a student into the roster.
	 */
	public static void addStudent()
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
		}
	/*
	 * This method will delete all the information of a chosen student.
	 * It will print the entire roster and give each student a number
	 * the number the user inputs will be the student that is deleted.
	 */
	public static void deleteStudent()
		{
		 
		}
	}