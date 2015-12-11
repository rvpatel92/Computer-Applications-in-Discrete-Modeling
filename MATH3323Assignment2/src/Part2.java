
/**
 * Created by ravipatel on 3/20/15.
 */
public class Part2
{
    public static void main(String[] args)
    {

        for (int i = 11, j = 0; j <= 11; j++)
        {

            System.out.println("g(" + i + "," + j + ") = " + (binom(i,j) * (permh(i-j))));
            System.out.println("");
        }
        
    }

    public static int permh(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        else if (i == 1)
        {
            return 0;
        }
        else
        {
            return (i - 1) * ((permh(i - 1)) + (permh(i - 2)));
        }
    }


    public static int fact(int n, int m)
    {
       int total = n - m;
       int result = 1;
       for (int i = 1; i <= total; i++) 
       {
           result = result * i;
       }
       return result;  
    }
    
    public static int fact2(int n)
    {
    	int result = 1;
        for (int i = 1; i <= n; i++) 
        {
            result = result * i;
        }
        return result; 
    }
    
    public static int fact3(int m)
    {
    	int result = 1;
        for (int i = 1; i <= m; i++) 
        {
            result = result * i;
        }
        return result; 
    }
    
    public static int binom(int n, int m)
    {
    	int part1 = fact(n,m);
    	int part2 = fact3(m) * part1;
    	int answer = fact2(n) / part2;
    	return answer;
    }
}

