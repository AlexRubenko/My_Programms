import java.util.Scanner;

class Ex_6_1
{
    public static int Sum = 0;

    public static void main(String[]args)
    {
        int [] ar = new int[10];

        fillArray(ar);

        arraySum(ar);

        printArraySum();

    }

    public static  void fillArray (int[]array)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 int numbers");

        for(int i = 0; i < array.length; )
        {
            if(sc.hasNextInt())
            {
                array[i] = sc.nextInt();
                i++;
            }
            else
            {
                System.out.println("Incorrect value!");
                break;
            }
        }
        sc.close();
    }
    public static int arraySum(int[] array)
    {
        for (int i = 0; i < array.length; i++)
             Sum += array[i];
        return Sum;
    }

    public static void printArraySum()
    {
        System.out.println("Array sum = " + Sum);
    }
}
