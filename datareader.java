//Copied a lot of Paul Mullins' code for this reader, as it performs the exact function that is needed
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class DataReader {
		/* no data needed - this "object" is a procedure */
		public DataReader(String fileName, StackArray aList)
		{
			try
			{
				/* temp storage locations for input */
				String firstName, lastName;
				int age;
				double gpa;
				
				/* open the file and initialize a Scanner */
				File file = new File(fileName); 
				Scanner src = new Scanner(file).useDelimiter(",|\r\n|\n");

				while(src.hasNext())
				{
					lastName = src.next();
					firstName = src.next();
					age = src.nextInt();
					gpa = src.nextDouble();
					/* save the values in the array as an object */
					System.out.println("DEBUG: Made it to DataReader.java");
					aList.push(new Person(firstName, lastName, age, gpa)); //TODO: I think our issue is here. Nothing is being push.
					System.out.println("DEBUG: Made it past aList.push");
				}
			}
			catch(FileNotFoundException ex)
			{
				System.err.println("File " + fileName + " not found");  // note use or err instead of out
			}
			catch(IOException ex)
			{
				System.err.println("File read format error");
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.err.println("Too many data values");
			}
			catch(NoSuchElementException ex)
			{
				//this is so that if there is a blank line at the end of the file, the program will just treat it like its not there and move on without crashing
			}
		}
}