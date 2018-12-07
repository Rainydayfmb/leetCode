package easy;

/**
 * Author:Fmb
 * Description:
 * Date:15:25 2018/12/7
 * Modified By：
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("shjie dhef"));
    }

    public static int lengthOfLastWord(String word){
        if(word == null){
            return 0;
        }
        String[] strings = word.split(" ");
        if(strings.length == 0){
            return 0;
        }
        return strings[strings.length-1].length();
    }
}
