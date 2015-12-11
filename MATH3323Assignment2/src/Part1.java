/* Ravi Patel
 * Assignment 2 Part 1
 * MATH 3323/01 Applied Discrete
 * 
 * Question 1:
 * After analyzing the function, a very much faster way is to change the function from what is stated 
 * to just i + 2, where i is the input from the problem.  This function creates a more efficient way to compute 
 * rather than the function given to us from the assignment.
 * 
 * Question 2:
 * The value for which it takes at least 10 secconds to compute the formula given is 35.  
 * The arguement value is 35, and that took 9.630840000000001 seconds.
 * 
 * 
 */
public class Part1 
{

	public static void main(String[] args) 
	{
		for (int i = 0, number = 0; i <= 12; i++, number++)
		{
			System.out.println("Case " + number + ": " + vbrf(i));
		}
			
		System.out.println();
		System.out.println("======================");
		System.out.println();


		/*
			long t0 = System.nanoTime();
			int x = vbrf(35);
			long t1 = System.nanoTime();
			double timeInSeconds = (t1-t0)*1.0e-9;
			System.out.println("Time for each Case: " + timeInSeconds);
			*/
			
			System.out.println(7/0);
		
	}

	public static int vbrf(int i) 
	{
		if (i == 0)
		{
			return 2;
		}
		else if (i == 1)
		{
			return 3;
		}
		else if (i == 2)
		{
			return 4;
		}
		else if (i == 3)
		{
			return 5;
		}
		else 
		{
			return vbrf(i - 1) - vbrf(i - 2) + (3 * vbrf(i - 3)) - (2 * vbrf(i - 4));
		}
			
	}
	
	
	/*public static int fix(int i )
	{
		return (i + 2);
	}
	*/

}
