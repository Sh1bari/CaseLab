import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Palindrome = ");
        String text = in.nextLine();
        System.out.println(isPalindrome(text));
    }
    public static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
}
