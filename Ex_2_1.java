import java.io.*;

public class Ex_2_1
{
    public static void main(String[]args)
    {
        int tens = 0;
        int units = 0;

        int a = Integer.parseInt(args[0]);
   
        if (a<100)
        {
            tens = a / 10;
            units = a%10;
        }
            else System.out.println("You have entered not a two-digit number!" );

        System.out.println("The number of tens: " + tens + ", units : " + units);
        System.out.println("Sum of numbers: " + (tens + units) + ", units : " + (tens * units));
    }
}
