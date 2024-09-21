import java.util.Comparator;

/**
 * Compares two integers using the Comparator interface
 */
public class IdComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer first, Integer second) {
		// Compare the two integers and return -1, 0, or 1 to declare their precedence
		return first.compareTo(second);
	}
}
