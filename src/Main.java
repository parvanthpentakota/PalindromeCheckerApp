public class Main {

    public static void main(String[] args) {

        String input = "madam";
        String input = "Level";

        // Build linked list
        Node head = null;
        Node tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Reverse using stack
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        boolean isPalindrome = input.equals(reversed);

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    // Recursive function
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return checkPalindrome(str, start + 1, end - 1);
    }
}