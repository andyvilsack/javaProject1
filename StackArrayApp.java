import java.util.Scanner;
public class StackArrayApp {

	public static void main(String[] args)
	{
		StackArray myList = new StackArray();
		StackArray tempStack = new StackArray();
		StackArray myListCopy = new StackArray();
		boolean hasMoreData = true;
		boolean x = true;
		
		//-------------DATA 1
		String fileName = "data1.txt";
		DataReader obj = new DataReader(fileName, myList);
		
		try {
			System.out.println("Pop twice:");
			System.out.println(myList.pop());
			System.out.println(myList.pop());
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("attempt to pop an empty stack");
		}
		
		//-------------DATA 2
		fileName = "data2.txt";
		obj = new DataReader(fileName, myList);
		
		try {
			System.out.println("Pop five times:");
			System.out.println(myList.pop());
			System.out.println(myList.pop());
			System.out.println(myList.pop());
			System.out.println(myList.pop());
			System.out.println(myList.pop());
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("attempt to pop an empty stack");
		}
		
		System.out.println("remaining on first stack");
		System.out.println("remaining on second stack");

		while(myList.isEmpty() == false) {
			tempStack.push(myList.pop()); //pops values from myList to tempStack (objects are in reverse order)
			myListCopy.push(tempStack.pop());
		}
		
		
		while(myList.isEmpty() == false) {
			System.out.println(myList.pop());
		}
		
				
		//-------------DATA 3
		fileName = "data3.txt";
		obj = new DataReader(fileName, myListCopy);
	
		
		while(myListCopy.isEmpty() == false) {
			System.out.println(myListCopy.pop());
		}
		
	}
}