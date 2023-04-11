class Solution:
    def removeStars(self, s: str) -> str:
        stack = []  # Create an empty stack to keep track of characters
        for c in s:  # Loop through each character in the string
            if c != '*':  # If the current character is not an asterisk
                stack.append(c)  # Push it to the stack
            else:  # If the current character is an asterisk
                if stack and stack[-1] != '*':  # Check if the previous character in the stack is also an asterisk
                    stack.pop()  # If the previous character is not an asterisk, remove it from the stack
        return ''.join(stack)  # Join the characters in the stack to form the resulting string