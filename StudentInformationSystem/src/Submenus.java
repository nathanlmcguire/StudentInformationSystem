import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Submenus
	{
	
	static ArrayList <Student> roster = new ArrayList<Student>();
	static int addOrDelete;
	
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
		
		}
	public static void deleteStudent()
		{
		
		}
	
	}