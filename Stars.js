
var removeStars = function(s) {
    // Create an empty stack to keep track of characters
    let stack = [];
    
    // Loop through each character in the string
    for (let i = 0; i < s.length; i++) {
        // If the current character is not an asterisk, push it to the stack
        if (s[i] !== '*') {
            stack.push(s[i]);
        } else { // If the current character is an asterisk
            // Check if the previous character in the stack is also an asterisk
            if (stack.length > 0 && stack[stack.length - 1] !== '*') {
                // If the previous character is not an asterisk, remove it from the stack
                stack.pop();
            }
        }
    }
    
    // Join the characters in the stack to form the resulting string
    return stack.join('');
};