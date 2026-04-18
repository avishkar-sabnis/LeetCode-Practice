public class RomanToInteger {

    public static void main(String[] args) {

        String roman = "MCMXCIV";

        char[] romanArray = roman.toCharArray();
        int i = 0;
        int result = 0;

        while (i < romanArray.length) {

            if (i + 1 < romanArray.length) {

                if (romanArray[i] == 'I' && romanArray[i + 1] == 'V') {
                    result += 4;
                    i += 2;
                    continue;
                } else if (romanArray[i] == 'I' && romanArray[i + 1] == 'X') {
                    result += 9;
                    i += 2;
                    continue;
                } else if (romanArray[i] == 'X' && romanArray[i + 1] == 'L') {
                    result += 40;
                    i += 2;
                    continue;
                } else if (romanArray[i] == 'X' && romanArray[i + 1] == 'C') {
                    result += 90;
                    i += 2;
                    continue;
                } else if (romanArray[i] == 'C' && romanArray[i + 1] == 'D') {
                    result += 400;
                    i += 2;
                    continue;
                } else if (romanArray[i] == 'C' && romanArray[i + 1] == 'M') {
                    result += 900;
                    i += 2;
                    continue;
                }
            }

            if (romanArray[i] == 'I') {
                result += 1;
            } else if (romanArray[i] == 'X') {
                result += 10;
            } else if (romanArray[i] == 'V') {
                result += 5;
            } else if (romanArray[i] == 'L') {
                result += 50;
            } else if (romanArray[i] == 'C') {
                result += 100;
            } else if (romanArray[i] == 'D') {
                result += 500;
            } else if (romanArray[i] == 'M') {
                result += 1000;
            }

            i++;
        }

        System.out.println(result);
    }
}