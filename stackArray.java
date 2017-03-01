import java.util.Arrays;
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
			stackArray[i]=new Person(); //load array with accurate number of person
		}
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return false; //will never be true, always growing
	}
	public void push(Person obj)
	{
		//System.out.println("DEBUG: Hit the push");
		if(top==max-1)
		{
			int topHold = top;
			int count = 0;
			max = max * 2;
			Person tempArray[] = new Person[max/2];  //The array is half full of nothing, don't search that
			Person tempArray2[] = new Person[max/2];  //The array is half full of nothing, don't search that
			for(int i=0;i<(max/2);i++)
			{
				tempArray[i] = this.pop();
			}
			for(int j=(max/2)-1;j>=0;j--)
			{
				tempArray2[count] = tempArray[j];
				count++;
			}
			
			Person stackArraycopy[] = new Person[max];
			for(int k = 0; k<=topHold;k++)
			{
				stackArraycopy[k] = tempArray2[k];
			}
			for (int l = topHold+1; l<max;l++)
			{
				stackArraycopy[l]=new Person();
			}
			this.stackArray = new Person[max];
			for (int m = 0; m<max;m++)
			{
				this.stackArray[m] = stackArraycopy[m];
			}
			this.top = topHold;
			this.push(obj);
		}
		else
		{
			stackArray[++top] = obj;
		}
	}
	public Person pop()
	{
		return stackArray[top--]; //TODO: Elements have to be removed?
	}
	public String toString()
	{
		String aString = "";
		for (int i=0; i<max; i++) {
			aString += stackArray[i] + "\n";
			//System.out.println(aString);
		}
		return aString;
	}
}
