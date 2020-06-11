package assighnments.string;

public class Palindrome_38 {
    public static void main(String[] args) {
        Palindrome_38 palindrome_38 = new Palindrome_38();
        // calling the method
        final boolean result = palindrome_38.checkPalindrome("refer");
        System.out.println(result);
    }

    public boolean checkPalindrome(String name) {
        // step1: get reverse
        //compare original string and reverse string
        StringBuilder reverseBuilder = new StringBuilder();
        for (int i = name.length()-1; i >=0; i--) {
            reverseBuilder.append(name.charAt(i));
        }

        if (name.equals(reverseBuilder.toString())) {
            return true;
        } else {
            return false;
        }
    }
}

