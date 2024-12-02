import java.util.Scanner;
public class Matrix_IO {
    public static void main(String[]args) {
    Scanner input = new Scanner (System.in);
    int[][] matrix= new int [3][3];
    int i,j,len;
    len = matrix.length;
    for (i=0; i < len; i++)
    {
        for (j=0; j < len; j++)
        {
            matrix[i][j] = input.nextInt();
        }
    }
    System.out.println ("The matrix: \n");
    for (i=0; i <len; i++)
    {
        for (j=0; j<len; j++)
        {
            System.out.print (matrix[i][j]+ "  ");
        }
        System.out.println ();
    }
    }
}