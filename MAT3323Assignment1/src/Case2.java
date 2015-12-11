/*Ravi Patel
 * Assignment 1 Case 2
 * MATH 3323/01 Applied Discrete
 * 
 * Answer for case 2:  Implementing the problem for case B, this shows that the two methods of computing do match and is correct.
 */
public class Case2 {

	public static void main(String[] args) 
	{
		//this is the for loop to compute the simple formula
		for (long i = 0, number = 0; i <= 15; i++, number++)
		{
			System.out.println("Case " + number + ": " + "B(" + i + ") = " + formula(i));
		}
		
		System.out.println();
		System.out.println("=====================");
		System.out.println();
		
		//this is the for loop to compute the recursion formula
		for (long iter = 0, number = 0; iter <= 15; iter++, number++)
		{
			System.out.println("Case " + number + ": " + "B(" + iter + ") = " + recursion(iter));
		}
	}
	
	//method that takes in long and returns long
	public static long formula(long i)
	{
		return (long)((i * i) * Math.pow(2, i) + i * Math.pow(3, i));
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
			return 5;
		}
		else if (iter == 2)
		{
			return 34;
		}
		else if (iter == 3)
		{
			return 153;
		}
		else if (iter == 4)
		{
			return 580;
		}
		else 
		{
			return (12 * recursion(iter - 1) - 57 * recursion(iter - 2) + 134 * recursion(iter - 3) - 156 * recursion(iter - 4) + 72 * recursion(iter - 5));
		}
	}

}
