import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int arr2D[][] = new int[3][3];
        int lengthOfRow = arr2D[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < lengthOfRow; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < lengthOfRow; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]);
            }
            System.out.println();
        }
    }
}
