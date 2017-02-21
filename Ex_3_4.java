import java.util.Scanner;

public class Ex_3_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int card = 0;
        int suit = 0;

        System.out.println("Type int N (6 <= N <= 14):");
        if(sc.hasNextInt() )
        {
            card = sc.nextInt() - 6;
        }
        else
            {
            System.out.println("Incorrect value");
            }

        System.out.println("Type int M (1 <= M <= 4):");
        if(sc.hasNextInt())
        {
            suit = sc.nextInt() - 1;
        }
        else System.out.println("Incorrect value");
        sc.close();

        String[][] Carddeck = {{"пики 6","пики 7","пики 8","пики 9","пики 10","валет пик","дама пик","кjроль пик","пиковый туз"},
                {"трефы 6","трефы 7","трефы 8","трефы 9","трефы 10","валет треф","дама треф","король треф","трефовый туз"},
                {"бубны 6","бубны 7","бубны 8","бубны 9","бубны 10","валет бубновый","дама бубновая","король бубновый","бубновый туз"},
                {"червы 6","червы 7","червы 8","червы 9","червы 10","валет червей","дама червей","король червей","червовый туз"}};

        System.out.println("Ваша карта - " + Carddeck[suit][card]);
    }
}
