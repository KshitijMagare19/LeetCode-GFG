import java.util.Stack;

class Solution {
    public boolean canBeValid(String s, String locked) {
        int stringLength = s.length();
        if (stringLength % 2 == 1) {
            return false;
        }

        Stack<Integer> openIndices = new Stack<>();
        Stack<Integer> unlockedIndices = new Stack<>();

        // Traverse the string
        for (int i = 0; i < stringLength; i++) {
            if (locked.charAt(i) == '0') {
                unlockedIndices.push(i);
            } else if (s.charAt(i) == '(') {
                openIndices.push(i);
            } else if (s.charAt(i) == ')') {
                if (!openIndices.isEmpty()) {
                    openIndices.pop();
                } else if (!unlockedIndices.isEmpty()) {
                    unlockedIndices.pop();
                } else {
                    return false;
                }
            }
        }

        // Match remaining open parentheses
        while (!openIndices.isEmpty() && !unlockedIndices.isEmpty() &&
               openIndices.peek() < unlockedIndices.peek()) {
            openIndices.pop();
            unlockedIndices.pop();
        }

        // Final check
        if (openIndices.isEmpty() && !unlockedIndices.isEmpty()) {
            return unlockedIndices.size() % 2 == 0;
        }

        return openIndices.isEmpty();
    }
}