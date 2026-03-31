import java.util.Objects;

public class SubstringWithConcatenation {

    public static void main(String[] args) {

        String[] stringArr = {"foo","bar"};
        String[] resultArray = new String[2];
        for(int i=0;i<stringArr.length-1;i++){
            resultArray[i] = stringArr[i]+stringArr[i+1];
            resultArray[i+1]=stringArr[i+1]+stringArr[i];
        }

        for(String res:resultArray){
            System.out.println(res);
        }

        String inputStr = "barfoothefoobarman";
        String[] permuteStrArr = new String[10];
        for(int i=0;i<permuteStrArr.length;i++){
            permuteStrArr[i]= (String) inputStr.subSequence(i,i+3);
        }
        for(int i=0;i<permuteStrArr.length-1;i++){
            for(int j=0;j< permuteStrArr.length-1;j++){
                if(Objects.equals(permuteStrArr[i], stringArr[j])){
                    System.out.println("susequence found");
                }
            }
        }



    }



}
