import java.util.Comparator;
import java.util.Comparator;
public class SortByClass implements Comparator<Student>
	{
	public int compare (Student s1, Student s2)
		{
		return s1.getPeriodOne().compareTo(s2.getPeriodOne());
		}
		}