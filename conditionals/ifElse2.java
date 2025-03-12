import java.util.Scanner;

public class ifElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: " );
        int age  =  sc.nextInt();
        if (age>=18) {
            System.out.println("you are adult");
        }
        else if(age >=60){
            System.out.println("you are old man now");
        }
        else{
            System.out.println("Yoou are a kid");
        }
        sc.close();
    }
}
