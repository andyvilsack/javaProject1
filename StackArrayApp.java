import java.util.Scanner;
public class StackArrayApp {

	public static void main(String[] args)
	{
//		Person guy = new Person("Jew", "Lastname1", 1, 1.00);
//		Person guy2 = new Person("Dog", "Lastname2", 2, 2.00);
//		Person guy3 = new Person("Andy", "Lastname3", 3, 3.00);
//		Person guy4 = new Person("Eat", "Lastname4", 4, 4.00);
//		Person guy5 = new Person("Butt", "Lastname5", 5, 5.00);
//		Person guy6 = new Person("John", "Lastname6", 6, 6.00);
//		Person guy7 = new Person("-", "Lastname7", 7, 7.00);
//		Person guy8 = new Person("George", "Lastname8", 8, 6.00);
//		StackArray myList = new StackArray();
//		myList.push(guy);
//		myList.push(guy2);
//		myList.push(guy3);
//		myList.push(guy4);
//		myList.push(guy5);
//		myList.push(guy6);
//		myList.push(guy7);
//		myList.push(guy8);
//		System.out.println(myList);

		StackArray myList = new StackArray();
		
		System.out.println("Enter the name of the file");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.nextLine();
		DataReader(fileName, myList);
		
		//Data
		

	}
}
