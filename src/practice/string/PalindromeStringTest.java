package practice.string;

public class PalindromeStringTest {
    public static void main(String[] args) {

        System.out.println("Is aaa palindrom : "+isPalindromString("aaa"));
        System.out.println("Is abc palindrom : "+isPalindromString("abc"));
        System.out.println("Is bbbb palindrom : "+isPalindromString("bbbb"));
        System.out.println("Is defg palindrom : "+isPalindromString("defg"));

    }

    // check string is palindrome or not
    public static boolean isPalindromString(String text){
        String reverse = reverse(text);

        if (text.equals(reverse)){
            return true;
        }
        return false;
    }
    // reverse string using recursion
    public static String reverse(String input){
        if (input==null || input.isEmpty()){
            return input;
        }

        return input.charAt(input.length()-1)
                +reverse(input.substring(0, input.length()-1));
    }

}
