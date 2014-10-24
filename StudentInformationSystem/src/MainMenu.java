import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;

public class MainMenu
	{
	static String option1, addOrDelete, change, sort;
	static double average, gpa, total;
	
	public static void main(String[] args) throws FileNotFoundException
		{
		Submenus.addToRoster();
		while(true)
			{
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
						Printsorter();
					}
				else if(sort.equals("2"))
					{
					findGPA();
						Collections.sort(Submenus.roster, new SortByGPA());
						Printsorter();
					}
				else if(sort.equals("3"))
					{
						Collections.sort(Submenus.roster, new SortByClass());
						Printsorter();
					}
				else
					{
				
					}
			}
		}
		public static void Printsorter()
			{
			System.out.println("This is the sorted class ");
			GradeAndScheduleChanger.studentNumber = 1;
			for(Student s : Submenus.roster)
				{
				System.out.println("ID:" + GradeAndScheduleChanger.studentNumber + ": " + s.getFirstName() + " " + s.getLastName() + "  " + s.getPeriodOne() + ": " + s.getPeriodOneGrade() + "| " + s.getPeriodTwo() + ": " + s.getPeriodTwoGrade() + "| " + s.getPeriodThree() + ": " + s.getPeriodThreeGrade() + "|" + s.getGradePointAverage() + "0");			
				GradeAndScheduleChanger.studentNumber++;
			}
		}
		public static void findGPA()
			{
			for(Student s : Submenus.roster)
				{
				gpa = 0;
				switch(s.getPeriodOneGrade())
					{
					case "A+":
						{
						gpa = gpa + 4.3;
						break;
						}
					case "A":
						{
						gpa = gpa + 4;
						break;
						}
					case "A-":
						{
						gpa = gpa + 3.7;
						break;
						}
					case "B+":
						{
						gpa = gpa + 3.3;
						break;
						}
					case "B":
						{
						gpa = gpa + 3;
						break;
						}
					case "B-":
						{
						gpa = gpa + 2.7;
						break;
						}
					case "C+":
						{
						gpa = gpa + 2.3;
						break;
						}
					case "C":
						{
						gpa = gpa + 2;
						break;
						}
					case "C-":
						{
						gpa = gpa + 1.7;
						break;
						}
					case "D+":
						{
						gpa = gpa + 1.3;
						break;
						}
					case "D":
						{
						gpa = gpa + 1;
						break;
						}
					case "D-":
						{
						gpa = gpa + 0.7;
						break;
						}
					case "F":
						{
						gpa = gpa + 0;
						break;
						}
					}
				switch(s.getPeriodTwoGrade())
					{
					case "A+":
						{
						gpa = gpa + 4.3;
						break;
						}
					case "A":
						{
						gpa = gpa + 4;
						break;
						}
					case "A-":
						{
						gpa = gpa + 3.7;
						break;
						}
					case "B+":
						{
						gpa = gpa + 3.3;
						break;
						}
					case "B":
						{
						gpa = gpa + 3;
						break;
						}
					case "B-":
						{
						gpa = gpa + 2.7;
						break;
						}
					case "C+":
						{
						gpa = gpa + 2.3;
						break;
						}
					case "C":
						{
						gpa = gpa + 2;
						break;
						}
					case "C-":
						{
						gpa = gpa + 1.7;
						break;
						}
					case "D+":
						{
						gpa = gpa + 1.3;
						break;
						}
					case "D":
						{
						gpa = gpa + 1;
						break;
						}
					case "D-":
						{
						gpa = gpa + 0.7;
						break;
						}
					case "F":
						{
						gpa = gpa + 0;
						break;
						}
					}
				switch(s.getPeriodThreeGrade())
					{
					case "A+":
						{
						gpa = gpa + 4.3;
						break;
						}
					case "A":
						{
						gpa = gpa + 4;
						break;
						}
					case "A-":
						{
						gpa = gpa + 3.7;
						break;
						}
					case "B+":
						{
						gpa = gpa + 3.3;
						break;
						}
					case "B":
						{
						gpa = gpa + 3;
						break;
						}
					case "B-":
						{
						gpa = gpa + 2.7;
						break;
						}
					case "C+":
						{
						gpa = gpa + 2.3;
						break;
						}
					case "C":
						{
						gpa = gpa + 2;
						break;
						}
					case "C-":
						{
						gpa = gpa + 1.7;
						break;
						}
					case "D+":
						{
						gpa = gpa + 1.3;
						break;
						}
					case "D":
						{
						gpa = gpa + 1;
						break;
						}
					case "D-":
						{
						gpa = gpa + 0.7;
						break;
						}
					case "F":
						{
						gpa = gpa + 0;
						break;
						}
					}
				average = gpa / 3;
				s.setGradePointAverage(gpa);
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
