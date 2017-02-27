import java.util.Scanner;

public class Ex_5_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer number greater than 0.");

        int a = sc.nextInt();

        sc.close();

        numbersDischarge(a);
    }

    public static void numbersDischarge(int number)
    {
        while (number > 0)
        {
            System.out.print(number % 10 + " " );
            number /= 10;
        }
    }
}