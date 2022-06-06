import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Oleksandr Kokhaniuk
 * @created 6/6/2022, 10:03 PM
 */
public class Main {


    public static void
    generateParenthesis(int n, int open, int close, String s, ArrayList<String> ans) {
        if (open == n && close == n) {
            ans.add(s);
            return;
        }
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "(", ans);
        }
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + ")", ans);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number of parenthesis");
        int n = in.nextInt();
        System.out.println("You entered integer " + n);

        ArrayList<String> ans = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", ans);

        for (String s : ans) {
            System.out.println(s);
        }
    }
}
