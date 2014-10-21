import java.util.Comparator;
public abstract class SortByLastName implements Comparator<Student>
	{

	public static void main(String[] args)
		{
		
		}
		public int compare(Student s1, Student s2)
			{
			return s2.getLastName().compareTo(s1.getLastName());
			}


		}

	}
