import java.util.Scanner;

public class Ex_4_3
{
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type firs integer number A ");

        int a = sc.nextInt();

        System.out.println("Type second integer number B. Observe the condition A < B ");

        int b = sc.nextInt();

        System.out.println("Sum of numerical sequence from A to B = " + SumOfNumericalSequence(a,b));

    }
    public static long SumOfNumericalSequence (int x, int y)
    {
        long sum = x*x;

        for (int i =1 ; i <= (y - x); i++)
        {
            sum += (x + i)*(x + i);
        }
        return sum;
    }
}