package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
    int i,j,k,l;
        System.out.println("Enter number of Rows : ");
        i = data.nextInt();
        System.out.println("Enter number of Columns : ");
        j = data.nextInt();
        int matrix1[][]=new int[i][j];
        int matrix2[][]=new int[i][j];
        int addition[][]= new int[i][j];
        System.out.println("Enter elements of first matrix : ");
        for (k=0;k<i;k++){
            for (l=0;l<j;l++){
                matrix1[k][l]= data.nextInt();
            }
        }
        System.out.println("Enter elements of Second matrix : ");
        for (k=0;k<i;k++){
            for (l = 0; l < j; l++) {
                matrix2[k][l] = data.nextInt();
            }
        }
        for (k=0;k<i;k++) {
            for (l = 0; l < j; l++) {
                addition[k][l] = matrix1[k][l] + matrix2[k][l];
            }
        }
        System.out.println("Sum of two matrices is : ");
        for (k=0;k<i;k++){
            for (l = 0; l < j; l++) {
                System.out.print(addition[k][l] + "\t");
            } System.out.println();

        }

    }
}
