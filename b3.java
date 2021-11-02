import java.util.Scanner;
public class b3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s;
        System.out.println("Enter a word");
        s=scanner.next();
        int n = s.length();
        for (int i = 0; i < (n/2); i++) {
            if (s.charAt(i) == s.charAt(n - i - 1)) {
            System.out.println("true");
            } else System.out.println("false");
        }
    }
}