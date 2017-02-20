import java.io.*;
import java.util.Arrays;

class Ex_3_1
{
    public static void main(String[] args)
    {
        String [][] array1 = new String[8][8];

        fillArray(array1);

        printArray(array1);

    int x1 = Integer.parseInt(args[0]);
    int y1 = Integer.parseInt(args[1]);
    int x2 = Integer.parseInt(args[2]);
    int y2 = Integer.parseInt(args[3]);

    if(array1[x1][y1] == array1[x2][y2])
    {
        System.out.print("These two checkerboard cells are the same color. It is " + array1[x1][y1]);
    }
    else
    {
        System.out.print("These two checkerboard cells are of different colors. Cell ("+ x1 + ", " + y1 +") is "
                + array1[x1][y1] + ", but cell (" + x2 + ", " + y2 + ") is " + array1[x2][y2]);
    }

    }
    static void fillArray(String[][] ar)
    {
        int key = -1;

        for( int i = 0; i < ar.length; i++)
        {
            for (int j = 0; j < ar.length; j++)
            {
                if(key < 0)
                {
                    ar[i][j] = "White";
                    key = key * (-1);
                }
                else
                {
                    ar[i][j] = "Black";
                    key = key * (-1);
                }
            }
            key = key * (-1);
        }
    }
    static  void printArray(String[][] ar)
    {
        for (int a = 1;a < 9;a++)
            System.out.print("     " + a + " ");

        System.out.print("\n");

        for( int i = 0; i < ar.length; i++)
                {
            System.out.print(i+1 + "  ");
            for (int j = 0; j < ar.length; j++)
            {
                if(j != 8)
                {
                    System.out.print(ar[i][j] + "  ");
                }
                else
                {
                    System.out.print(ar[i][j]);
                }
            }
            System.out.print("\n\n");
        }
    }
}