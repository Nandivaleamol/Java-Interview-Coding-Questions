package practice.nums;

public class ReverseNums {
    public static void main(String[] args) {
        int number = 1234;
        int reverse;

        int rev = 0;

        // Approach- 1st
        StringBuffer sb = new StringBuffer(String.valueOf(number));
        reverse = Integer.parseInt(sb.reverse().toString());
        System.out.println("Reversed number is: "+reverse);

        // Approach- 2nd

        while (number!=0){

            int remainder = number%10;
            rev = rev*10 +remainder;
            number = number/10;
        }
        System.out.println("Reversed number is: "+rev);

    }
}
