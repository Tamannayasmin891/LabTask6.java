import java.util.*;
public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans;
        if (N % 2 == 1) ans = "Weird";
        else if (N >= 2 && N <= 5) ans = "Not Weird";
        else if (N >= 6 && N <= 20) ans = "Weird";
        else ans = "Not Weird";
        System.out.println(ans);
    }
}
