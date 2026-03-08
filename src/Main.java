import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {

        // Define input string
        String input = "refer";

        // Create deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}