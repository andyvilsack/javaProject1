//used Paul Mullins' example for the skeleton of the class, then added all the setters and getters
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double gpa;
	
	//constructors 
	Person()
	{
		firstName="FirstName";
		lastName="LastName";
		age=99;
		gpa=99.99;
	}
	Person(String fn, String ln, int yrs, double score)
	{
		firstName = fn;
		lastName = ln;
		age = yrs;
		gpa = score;
	}
	public String toString()
	{
		String print = age + " " + gpa + " " + firstName + " " + lastName;
		return print; 
	}
	String getlastName() 
	{
		return lastName;
	}
	String getfirstName()
	{
		return firstName;
	}
	int getAge()
	{
		return age;
	}
	double getGPA()
	{
		return gpa;
	}
	void setLastName(String LN)
	{
		lastName = LN;
	}
	void setfirstName(String FN)
	{
		firstName = FN;
	}
	void setage (int A)
	{
		age = A;
	}
	void setGPA (double G)
	{
		gpa = G;
	} 
}