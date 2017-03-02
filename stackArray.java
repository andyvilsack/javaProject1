import java.util.Arrays;
import java.util.*;

public class StackArray {
	public static final int STARTMAX = 2;
	private Person stackArray[] = new Person[STARTMAX];
	private int numPeople;
	private int top = -1;
	private int max = STARTMAX;
	//constructor
	StackArray()
	{
		stackArray[0]=new Person();
		stackArray[1]=new Person();
	}
	StackArray(int num)
	{
		for(int i = 0; i<num-1; i++)
		{
			stackArray[i]=new Person();
		}
	}
	//checks to see if stack is empty
	public boolean isEmpty()
	{
		return (top==-1);
	}
	//checks to see if stack is full, added for redundancy
	public boolean isFull()
	{
		return false; //will never be true, always growing
	}
	//pushes the object passed into in onto the stack
	public void push(Person obj)
	{
		if(top==max-1)
		{
			int topHold = top;
			int count = 0;
			max = max * 2;
			Person tempArray[] = new Person[max/2];  //The array is half full of nothing, don't search that
			Person tempArray2[] = new Person[max/2];  //The array is half full of nothing, don't search that
			//pop everything off of the array onto a temp
			for(int i=0;i<(max/2);i++)
			{
				tempArray[i] = this.pop();
			}
			//flip all of those onto another temp so its in the correct order
			for(int j=(max/2)-1;j>=0;j--)
			{
				tempArray2[count] = tempArray[j];
				count++;
			}
			//make a new stackarray and load the elements from the temp array
			Person stackArraycopy[] = new Person[max];
			for(int k = 0; k<=topHold;k++)
			{
				stackArraycopy[k] = tempArray2[k];
			}
			//fill the rest of the stackarray with dummy items
			for (int l = topHold+1; l<max;l++)
			{
				stackArraycopy[l]=new Person();
			}
			//assign the temp stackarray to the object's stack array
			this.stackArray = new Person[max];
			for (int m = 0; m<max;m++)
			{
				this.stackArray[m] = stackArraycopy[m];
			}
			this.top = topHold;
			//recursively call push to put the object on the stack
			this.push(obj);
		}
		else
		{
			stackArray[++top] = obj;
		}
	}
	public Person pop()
	{
		if(top == -1) {
			return stackArray[top];
			//1throw new EmptyStackException();
		}
		
		else {
			return stackArray[top--];
		}
	}
	public String toString()
	{
		String aString = "";
		for (int i=0; i<max; i++) {
			aString += stackArray[i] + "\n";
		}
		return aString;
	}
}
