import math3323.sequence.Matrix;
import math3323.sequence.Sequence;


public class Relationship_Assignment3 
{
	public static void main(String[] args)
	{
		Sequence sq = new SquareFunction();
		Matrix m = Matrix.sequenceFill(12,15,sq);
		// number of equations (rows)
		// number of variables (columns)
		// sequence
		System.out.println(m);
	}
	
}
	
	//Represented our square Function
	class SquareFunction implements Sequence
	{
		@Override
		public long get(long n) 
		{
			return n*n;
		}	
	}
