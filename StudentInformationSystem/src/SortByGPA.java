import java.util.Comparator;
public class SortByGPA implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
			{
			return s2.getGradePointAverage().compareTo(s1.getGradePointAverage());
			}
	}
