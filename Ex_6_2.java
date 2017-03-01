import java.util.Scanner;

class Ex_6_2
{
    public static long product ;

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
    public static long arraySum(int[] array)
    {
        product = array[0];

        for (int i = 1; i < array.length; i++)
            product *= array[i];
        return product;
    }

    public static void printArraySum()
    {
        System.out.println("Array product = " + product);
    }
}
