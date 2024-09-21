import java.util.Comparator;

/**
 * Compares two student names using the Comparator interface
 */
public class NameComparator implements Comparator<Student>{
	@Override
	public int compare(Student first, Student second) {
		// Compare the two student names and return -1, 0, or 1 to declare their precedence
		return first.getName().compareTo(second.getName());
	}
}
