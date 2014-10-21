import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Submenus
	{
	
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
	public static void addToRoster() throws FileNotFoundException
		{
		Scanner file = new Scanner (new File ("studentlist.txt"));
		
		while(file.hasNextLine())
			{
			roster.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next()));
			}
		}
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
	public static void deleteStudent()
		{
		
		}
	
	}