import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "loveleetcode";
        char[] arr = str.toCharArray();

        Map<Character,Integer> charCountMap = new HashMap<>();

        //get frequency of each character
        for (char c : arr) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : arr) {
            if (charCountMap.get(c) == 1)
                System.out.println(c);
        }



    }
}
