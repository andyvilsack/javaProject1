import java.util.Scanner;
public class StackArrayApp {

	public static void main(String[] args)
	{
		StackArray myList = new StackArray();
		String fileName = "data1.txt";
		DataReader obj = new DataReader(fileName, myList);
		
		System.out.println("data1.txt");
		System.out.println(myList);
		
		System.out.println("data1.txt popped");
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		System.out.println("\n");


		fileName = "data2.txt";
		obj = new DataReader(fileName, myList);
		
		System.out.println("data2.txt");
		System.out.println(myList);

		System.out.println("data2.txt popped");
//		for(int i = 0; i <= 5; i++) {
//			System.out.println(myList.pop());
//		}
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		System.out.println(myList.pop());
		
		System.out.println("\n");
		
		StackArray tempStack = new StackArray();
		System.out.print("myList is empty:");
		System.out.println(myList.isEmpty());
		System.out.print("tempStack is empty:");
		System.out.println(tempStack.isEmpty());
		
		boolean hasMoreData = true;
		while (hasMoreData == true) { //pop remaining values off myList and push them on tempStack
			if(myList.isEmpty() == false) {
				tempStack.push(myList.pop());
			}
			else {
				hasMoreData = false;
			}
		}
	
	
		StackArray myListCopy = new StackArray();
		
		boolean x = true;
		while (x == true) { //pop values off tempStack and push them on myList
			if(tempStack.isEmpty() == false) {
				myListCopy.push(tempStack.pop());
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
		
		
		
		System.out.println("\nmylist:");
		System.out.println(myList);

		System.out.println("\ntempStack:");
		System.out.println(tempStack);
		
					
	
		
		
		fileName = "data3.txt";
		obj = new DataReader(fileName, myListCopy);
		
		System.out.println("\nmyListCopy:");
			System.out.println(myListCopy);
			
			while(myListCopy.isEmpty() == false) {
				System.out.println(myListCopy.pop());
			}
			
			System.out.print("\nmyList is empty:");
			System.out.println(myList.isEmpty());
			System.out.print("tempStack is empty:");
			System.out.println(tempStack.isEmpty());
			System.out.print("myListCopy is empty:");
			System.out.println(myListCopy.isEmpty());
	}
}

