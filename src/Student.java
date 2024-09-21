
public class Student {
	private int rollno;
	private String name;
	private String address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	/**
	 * Getter for the roll number
	 * @return the student's roll number
	 */
	public int getRollno() {
		return rollno;
	}
	
	/**
	 * Setter for the roll number
	 * @param rollno
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	/**
	 * Getter for the name
	 * @return the student's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter for the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter for the address
	 * @return the student's address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Setter for the address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println("Roll Number: " + getRollno());
		System.out.println("Student Name: " + getName());
		System.out.println("Address: " + getAddress());
	}
	
}
