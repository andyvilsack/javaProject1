import java.util.Scanner;
public class StackArrayApp {

	public static void main(String[] args)
	{
		StackArray myList = new StackArray();
		String fileName = "data1.txt";
		DataReader obj = new DataReader(fileName, myList);
		

		System.out.println(myList);
		
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		System.out.println("\n");


		fileName = "data2.txt";
		obj = new DataReader(fileName, myList);
		
		System.out.println(myList);

		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		System.out.println("\n");
		
		StackArray newStack = new StackArray();
		
		System.out.println(myList.isEmpty());
		System.out.println(newStack.isEmpty());
		
		boolean hasMoreData = true;
		while (hasMoreData == true) {
			if(myList.isEmpty() == false) {
				newStack.push(myList.pop());
			}
			else {
				hasMoreData = false;
			}
		}
		
		System.out.println("\nmylist:");
		System.out.println(myList);

		System.out.println("\nnewStack:");
		System.out.println(newStack);

	}
}

