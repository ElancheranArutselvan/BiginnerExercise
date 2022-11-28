package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String args[])
    {
        int i, j;
        System.out.println("Enter total rows and columns: ");
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int column = obj.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Enter matrix:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                matrix[i][j] = obj.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before Transpose is ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < column; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
        for(i = 0; i < column; i++)
        {
            for(j = 0; j < row; j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}

