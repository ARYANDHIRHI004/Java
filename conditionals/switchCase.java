import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks:");
        int marks = sc.nextInt();
        switch (marks) {
            case 10:
                System.out.println("marks are too poor");
                break;
            case 30:
                System.out.println("marks are poor");
                break;
            case 50:
                System.out.println("marks are average");
                break;
            case 80:
                System.out.println("marks are good");
                break;20
            case 100:
                System.out.println("marks are excellent");
                break;
            default:
                throw new AssertionError();
        }
    }
}
