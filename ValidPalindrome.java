public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "this is my name, Avishkar !";

        String result = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverseString = new StringBuilder(result).reverse().toString();
        if(result.equalsIgnoreCase(reverseString)) System.out.println("valid Palindrome");
        else System.out.println("invalid ");


    }

}
