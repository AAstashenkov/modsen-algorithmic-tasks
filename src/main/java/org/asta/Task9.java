package org.asta;

/**
 * @author Asta
 */
public class Task9 {
    public static int longestValidParentheses(String s) {
        int maxLength = 0;

        // Перебираем все возможные подстроки
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j += 2) {
                String sub = s.substring(i, j);
                if (isValid(sub)) {
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }

        return maxLength;
    }

    // Проверка на валидность подстроки
    private static boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("(()"));
        System.out.println(longestValidParentheses(")()())"));
        System.out.println(longestValidParentheses(""));
    }
}

