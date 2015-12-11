/*Ravi Patel
 * Assignment 1 Case 1
 * MATH 3323/01 Applied Discrete
 * 
 * Answer for case 1:  Implementing the problem for case A, this shows that the two methods of computing do match and is correct.
 */
public class Case1 {

	public static void main(String[] args) 
	{
		//this is the for loop to compute the simple formula
		for (long i = 0, number = 0; i <= 15; i++, number++)
		{
			System.out.println("Case " + number + ": " + i + " * " + i + " = " + formula(i));
		}
		
		System.out.println();
		System.out.println("======================");
		System.out.println();		
		
		//this is the for loop to compute the recursion formula
		for (long iter = 0, number = 0; iter <= 15; iter++, number++)
		{
			System.out.println("Case " + number + ": " + iter + " * " + iter + " = " + recursion(iter));
		}

	}
	
	//method that takes in long and returns long
	public static long formula(long i)
	{
		return (long) Math.pow(i, 2);
	}
	
	//method that takes in long and returns long
	public static long recursion(long iter)
	{
		if (iter == 0) 
		{
			return 0;
		} 
		else if (iter == 1)
		{
			return 1;
		}
		else if (iter == 2)
		{
			return 4;
		}
		else
		{
			return (3 * recursion(iter - 1) - 3 * recursion(iter - 2) + recursion(iter - 3));
		}
	}

}
