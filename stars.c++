class Solution {
public:
    string removeStars(string s) {
        stack<char> stk;  // Create an empty stack to keep track of characters
        for (char c : s) {  // Loop through each character in the string
            if (c != '*') {  // If the current character is not an asterisk
                stk.push(c);  // Push it to the stack
            } else {  // If the current character is an asterisk
                if (!stk.empty() && stk.top() != '*') {  // Check if the previous character in the stack is also an asterisk
                    stk.pop();  // If the previous character is not an asterisk, remove it from the stack
                }
            }
        }
        string result = "";  // Create an empty string to hold the resulting characters
        while (!stk.empty()) {  // Pop characters from the stack and append them to the resulting string
            result = stk.top() + result;
            stk.pop();
        }
        return result;  // Return the resulting string with asterisks removed
    }
};