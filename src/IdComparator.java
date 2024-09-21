import java.util.Comparator;

/**
 * Compares two student roll numbers using the Comparator interface
 */
public class IdComparator implements Comparator<Student> {
	@Override
	public int compare(Student first, Student second) {
		// Compare the two integers and return -1, 0, or 1 to declare their precedence
		return Integer.compare(first.getRollno(), second.getRollno());
	}
}
