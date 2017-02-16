import java.io.*;

public class Ex_2_3
{
    public static void main(String[]args)
    {
        int tens = 0;
        int units = 0;

        System.out.println("Enter a two-digit number:");

        int a = Integer.parseInt(args[0]);

        if (a<100)
        {
            tens = a / 10;
            units = a%10;
        }
        else System.out.println("You have entered not a two-digit number!" );

        System.out.println("Your number before swap operation : " + a);
        System.out.println("Swaped number: "  + (10*units + tens));
    }
}
