import java.util.Scanner;
public class StackArrayApp {

	public static void main(String[] args)
	{
		StackArray myList = new StackArray();
		StackArray tempStack = new StackArray();
		StackArray myListCopy = new StackArray();
		boolean hasMoreData = true;
		boolean x = true;
		
		String fileName = "data1.txt";
		DataReader obj = new DataReader(fileName, myList);
		
		System.out.println("data1.txt");
		System.out.println(myList);
		
		System.out.println("data1.txt popped #4");
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		System.out.println("\n");


		fileName = "data2.txt";
		obj = new DataReader(fileName, myList);
		
		System.out.println("data2.txt + myList");
		System.out.println(myList);

		System.out.println("data2.txt popped #6");

		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		
		while (hasMoreData == true) { //pop remaining values off myList and push them on tempStack
			if(myList.isEmpty() == false) {
				tempStack.push(myList.pop());
			}
			else {
				hasMoreData = false;
			}
		}

		while (x == true) { //pop values off tempStack and push them on myList
			if(tempStack.isEmpty() == false) {
				myListCopy.push(tempStack.pop());
				//myList.push(tempStack.pop()); //reloads original stack with values in correct order
			}
			else {
				x = false;
			}
		}
		
//		System.out.println("\nmyListCopy:");
//		while(myListCopy.isEmpty() == false) { //#8
//			System.out.println(myListCopy.pop());
//			
//		}

		
		fileName = "data3.txt";
		obj = new DataReader(fileName, myListCopy);
		
		System.out.println("\nmyListCopy:");
		System.out.println(myListCopy);
			
		System.out.println("\nmyListCopy popped");
		while(myListCopy.isEmpty() == false) {
			System.out.println(myListCopy.pop());
		}
	}
}

