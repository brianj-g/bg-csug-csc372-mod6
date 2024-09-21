import java.util.ArrayList;
import java.util.Comparator;

/**
 * Use a selection sort algorithm to sort objects using Comparator classes
 */
public class Sort {
	/**
	 * Uses selection sort to sort based on either name or ID, depending on whether a NameComparator or IdComparator is passed.  
	 * 	This method does not need to return a value 
	 * 	because the ArrayList is passed directly to it by reference.
	 * @param student
	 * @param nameCompare
	 */
	public static void sortObjects(ArrayList<Student> student, Comparator<Student> studentCompare){
		Student tmpStudent;
		
		for (int i = 0; i < student.size() -1; ++i) {
			int minIndex = i;
			for (int j = i + 1; j < student.size(); ++j) {
				if (studentCompare.compare(student.get(j), student.get(i)) < 1) {
					minIndex = j;
				}
			}
			
			tmpStudent = student.get(i);
			student.set(i, student.get(minIndex));
			student.set(minIndex, tmpStudent);
		}
	}
}
