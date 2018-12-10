package easy;

/**
 * Author:Fmb
 * Description:
 * Date:13:36 2018/12/10
 * Modified By：
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s){
        if(s.length()==0){
            return true;
        }
        int head=0;
        int tail=s.length()-1;
        char chead;
        char ctail;
        while(head<tail){
            chead=s.charAt(head);
            ctail=s.charAt(tail);
            if(!Character.isLetterOrDigit(chead)){
                head++;
            }else if(!Character.isLetterOrDigit(ctail)){
                tail--;
            }
            else{
                if(Character.toLowerCase(chead)!=Character.toLowerCase(ctail)){
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }
}
