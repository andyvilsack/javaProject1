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
		
		
		System.out.println("\nList 1 after pops");
		System.out.println(myList);

		fileName = "data2.txt";
		obj = new DataReader(fileName, myList);
		System.out.println("\n myList 2 before pop");
		System.out.println(myList);

		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		System.out.println("\n");
		System.out.println(myList);
		
		StackArray newStack = new StackArray();
		if(myList.isEmpty() != false) {
			//newStack.push(myList.pop());
			//System.out.println("boo");
		}



//		System.out.println("---");
//		StackArray newStack = new StackArray();
//		System.out.println("constructor Stack:");
//		System.out.println(newStack); //before it gets info, it's just constructor values
//		//Person v = myList.pop();
//		newStack.push(myList.pop());
//		newStack.push(myList.pop());
//		System.out.println("---");
//		System.out.println("newStack:");
//		System.out.println(newStack); //now has info from myStack, but reversed
//		
//		System.out.println("---");
//		StackArray newOldStack = new StackArray();
//		System.out.println("constructor Stack:");
//		System.out.println(newOldStack);
//		newOldStack.push(newStack.pop());
//		newOldStack.push(newStack.pop());
//		System.out.println("---");
//		System.out.println("newOldStack:");
//		System.out.println(newOldStack);

		
	}
}

