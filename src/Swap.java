import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.print("b = ");
        int b = in.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}