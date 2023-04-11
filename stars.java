import java.util.Stack;

public class RemoveStars {

    public static String removeStars(String s) {
        
        // Create a stack to hold non-star characters
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            
            // If the current character is not a star, push it onto the stack
            if (c != '*') {
                stack.push(c);
            }
            
            // Otherwise, if the stack is not empty, pop the top element
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        
        // Create a StringBuilder to hold the final result
        StringBuilder sb = new StringBuilder();
        
        // Iterate through the characters in the stack and append them to the StringBuilder
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        
        // Reverse the order of the characters in the StringBuilder to get the final result
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        
        String s = "a*b*c**d";
        System.out.println(removeStars(s)); // Output: "ac"
    }
}