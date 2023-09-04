import java.util.*;

class MatrixDiagonalSumMethod2 {
    public static void main(String args[]) {
        int a[][] = new int[3][3];
        int i, j, sumd1 = 0, sumd2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3x3 Matrix:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    sumd1 += a[i][j];
                }
                if (i + j == 2) {
                    sumd2 += a[i][j];
                }
            }
        }

        System.out.println("Matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of the main diagonal=" + sumd1);
        System.out.println("Sum of the anti-diagonal=" + sumd2);
    }
}
