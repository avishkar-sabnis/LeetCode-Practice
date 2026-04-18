public class PalindromicNumber {

    public static void main(String[] args) {

        int num = -121;

        String number = String.valueOf(num);


        String reverseNumber = new StringBuilder(number).reverse().toString();

        if(reverseNumber.equalsIgnoreCase(number))
            System.out.println("palindrome");


    }
}
