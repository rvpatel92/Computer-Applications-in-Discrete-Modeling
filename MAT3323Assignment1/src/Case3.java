/*/*Ravi Patel
 * Assignment 1 Case 3
 * MATH 3323/01 Applied Discrete
 * 
 * 
 * Answer for Case 3:  Implementing the problem for case C, this shows that the two methods of computing do not match and is 
 * not correct.  After doing further research, we can say that the recursion function for this case is not correct.  The function
 * that is calculated by the simple formula are the correct answers.
 */
public class Case3 {

	public static void main(String[] args) 
	{
		//this is the for loop to compute the simple formula
		for (long i = 0, number = 0; i <= 15; i++, number++)
		{
			System.out.println("Case " + number + ": " + "C(" + i + ") = " + formula(i));
		}
		
		System.out.println();
		System.out.println("=====================");
		System.out.println();
		
		//this is the for loop to compute the recursion formula
		for (long iter = 0, number = 0; iter <= 15; iter++, number++)
		{
			System.out.println("Case " + number + ": " + "C(" + iter + ") = " + recur(iter));
		}
	}
	
	//method that takes in long and returns long
	public static long formula(long i)
	{
		return (long) (12 + 8 * i - 3 * Math.pow(i, 2) + Math.pow(i, 3));
	}
	
	//method that takes in long and returns long
	public static long recur(long iter)
	{
		if (iter == 0)
		{
			return 12;
		}
		else if (iter == 1)
		{
			return 18;
		}
		else
		{
			return 2 * recur(iter - 1) - recur(iter - 2);
		}
	}

}
