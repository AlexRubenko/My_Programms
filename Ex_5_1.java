import java.util.Scanner;

public class Ex_5_1
{
    public static double p = 0.0; // Monthly interest rate P.
    public static double sum = 1000.0;  // Deposit Down Payment.

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Monthly interest rate P as a real number 0 < P < 25");

        if(sc.hasNextDouble() )
        {
            p = sc.nextDouble();
        }
        else
        {
            System.out.println("Incorrect value");
        }
        System.out.println("Your deposit will exceed 1100 rub after " + numberOfMonths(p) + " months ");

        System.out.println("Your deposit sum will reach " + finalDepositSum(p) + " rub after " + numberOfMonths(p) + " months");
    }

 public static int numberOfMonths (double a)
 {
     int k;
     double sum1 = sum;

     for( k = 1 ; k <= 12; k++)
     {
         sum1 += sum * (a / 100);

         if(sum1 > 1100.0)
         {
          break;
         }
     }
     return k; // returns the number of months when the deposit amount will be more than 1100.
 }

    public static double finalDepositSum (double b)
    {

        int k = numberOfMonths(b);

        double sum2 = sum  + k * ( sum * (b / 100));

        return  sum2;
    }
}
