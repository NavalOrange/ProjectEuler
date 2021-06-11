package ca.navalorange.questions1to50;

public class Q4 {
    public static void run() {
        int x = palindrome();
        System.out.println(isPalindrome(198891));
        System.out.println(x);
    }
    public static int palindrome() {
        int largestPalindrome = 999;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
//                System.out.println(i + " " + j + " " + i*j);
                if (i*j < largestPalindrome) { break; }
                if (isPalindrome(i*j)) {
                    largestPalindrome = i*j;
                }
            }
        }
        return largestPalindrome;
    }

    public static boolean isPalindrome(int val) {
        String string = "" + val;
        int length = string.length();
        String oneHalf = string.substring(0, length/2);
        String otherHalf = string.substring((length) - (length/2), length);
        for(int i = 0; i < length/2; i++) {
            if (oneHalf.toCharArray()[i] != otherHalf.toCharArray()[(length/2)-1-i]) {
                return false;
            }
        }
        return true;
    }

}