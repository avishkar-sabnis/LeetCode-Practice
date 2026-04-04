import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class maximumSubArraySum {

    public static void main(String[] args) {
        String longest = "([])";

        char[] characterArray = longest.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < characterArray.length; i++) {

            char ch = characterArray[i];

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("invalid");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    System.out.println("invalid");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}