import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String input = "civic";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both structures
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare FIFO and LIFO outputs
        while (!queue.isEmpty()) {

            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Required output format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}