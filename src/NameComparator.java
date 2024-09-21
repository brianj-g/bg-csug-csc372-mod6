import java.util.Comparator;

/**
 * Compares two strings using the Comparator interface
 */
public class NameComparator implements Comparator<String>{
	@Override
	public int compare(String first, String second) {
		// Compare the two strings and return -1, 0, or 1 to declare their precedence
		return first.compareTo(second);
	}
}
