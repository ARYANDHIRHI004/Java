public class incrementAndDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a++;
        System.out.println(a);

        a--;
        System.out.println(a);
        System.out.println("----------------------------------------");

        int c = 5;
        // int d = c++;

        System.out.println(c);
        // System.out.println(d);

        int e = c++ + ++c;
        System.out.println(e);
    }    
}
