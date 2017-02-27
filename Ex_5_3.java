import java.util.Scanner;

public class Ex_5_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer number > 1.");

        int a = sc.nextInt();

        sc.close();

        ifPrimeNumber(a);
    }
    public static void ifPrimeNumber(int b)
    {
        if(b>1 && b%b==0 && b%2!=0)
        {
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
