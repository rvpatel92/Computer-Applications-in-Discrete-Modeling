
/**
 * Created by ravipatel on 3/20/15.
 */
public class Assignment5
{
    public static void main(String[] args)
    {

        for (int i = 3, j = 0; j <= 4; j++)
        {
            System.out.println("g(" + i + "," + j + ") = " + (binom(i,j) * (permh(i) - permh(j))));
        }

        System.out.println(permh(3));
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

    public static int binom(int n, int m)
    {
        int answer;

        int factn = 1;
        for (int i = 1; i <= n; i++)
        {
            factn = factn * i;
        }

        int factm = 1;
        for (int j = 1; n <= m; j++)
        {
            factm = factm * j;
        }

        int factnm = 1;
        int total = n - m;
        for (int k = 1; k <= total; k++)
        {
            factnm = factnm * k;
        }

        answer = factn / (factm * factnm);

        return answer;
    }


}
