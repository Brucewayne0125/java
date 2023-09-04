import java.util.*;

class MatrixDiagonalSum {
public static void main(String args[]) {
int a[][] = new int[3][3];
int i, j, diagonalSum, antiDiagonalSum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 3x3 Matrix:");

for (i = 0; i < 3; i++)
{
for (j = 0; j < 3; j++)
{
a[i][j] = sc.nextInt();
}
}

diagonalSum = 0;
antiDiagonalSum = 0;
for (i = 0; i < 3; i++) 
{
diagonalSum += a[i][i];
antiDiagonalSum += a[i][2 - i];
}
System.out.println("Matrix:");
for (i = 0; i < 3; i++) {
for (j = 0; j < 3; j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
System.out.println("Sum of the diagonal=" + diagonalSum);
System.out.println("Sum of the anti-diagonal=" + antiDiagonalSum);
}
}

