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
		
		System.out.println("Original Stack:");
		System.out.println(myList);
		
//		System.out.println(myList.pop());
//		System.out.println(myList.pop());

		System.out.println("---");
		StackArray newStack = new StackArray();
		System.out.println("constructor Stack:");
		System.out.println(newStack); //before it gets info, it's just constructor values
		//Person v = myList.pop();
		newStack.push(myList.pop());
		newStack.push(myList.pop());
		System.out.println("---");
		System.out.println("newStack:");
		System.out.println(newStack); //now has info from myStack, but reversed
		
		System.out.println("---");
		StackArray newOldStack = new StackArray();
		System.out.println("constructor Stack:");
		System.out.println(newOldStack);
		newOldStack.push(newStack.pop());
		newOldStack.push(newStack.pop());
		System.out.println("---");
		System.out.println("newOldStack:");
		System.out.println(newOldStack);
		
	}
}

