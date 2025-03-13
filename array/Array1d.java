
import java.util.Scanner;

public class Array1d {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }   
        
        int arr2[]= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter "+i+" element: ");
            int num = sc.nextInt();
            arr2[i] = num;            
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            
        }   
        

    }
}
