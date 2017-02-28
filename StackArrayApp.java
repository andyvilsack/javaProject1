import java.util.Scanner;
public class StackArrayApp {

	public static void main(String[] args)
	{
		StackArray myList = new StackArray();
		
		//These three lines are for testing only. Comment these or delete them beore handing this is.
//		System.out.println("Enter the name of the file");
//		Scanner scanner = new Scanner(System.in);
//		String fileName = scanner.nextLine();
//		
		String fileName = "data1.txt";
		
		DataReader obj = new DataReader(fileName, myList);
		
		StackArray aaa = new StackArray();
		System.out.println(myList);
		aaa.pop();
	
		

	}
}
