import java.util.Scanner;

public class ifElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: " );
        int age  =  sc.nextInt();
        if (age>=18) {
            System.out.println("you are adult");
        }
        else{
            System.out.println("Yoou are a kid");
        }
        sc.close();
    }
}