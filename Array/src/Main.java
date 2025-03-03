import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,6};

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
        for (int item: arr){
            System.out.println(item);
        }

        int arr2[] = new int[5];
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Enter the Values in array");
            Scanner sc = new Scanner(System.in);
            arr2[j] = sc.nextInt();
        }

        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }


    }
}