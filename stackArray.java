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
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return false;
	}
	public void push(Person obj)
	{
		if(top==max-1)
		{
			int count = 0;
			max = max * 2;
			Person tempArray[] = new Person[max];
			Person tempArray2[] = new Person[max];
			for(int i=0;i<max;i++)
			{
				tempArray[i] = this.pop();
			}
			for(int j=max;j>0;j--)
			{
				tempArray2[count] = tempArray[j];
				count++;
			}
			
			
		}
		else
		{
			stackArray[++top] = obj;
		}
	}
	public Person pop()
	{
		return stackArray[top--];
	}
	public String toString()
	{
		String aString = "";
		for (int i=0; i<max; i++)
			aString += stackArray[i] + "\n";
		return aString;
	}
}
