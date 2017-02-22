
public class StackArrayApp {

	public static void main(String[] args)
	{
		Person guy = new Person();
		StackArray myList = new StackArray();
		myList.push(guy);
		myList.push(guy);
		System.out.println(myList);
	}
}
