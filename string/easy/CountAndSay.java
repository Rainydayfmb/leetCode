package easy;

/**
 * Author:Fmb
 * Description:
 * Date:14:21 2018/12/7
 * Modified By：
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) {
        StringBuilder curr = new StringBuilder("1");
        StringBuilder pre;
        int count = 1;
        char say;
        for (int i = 1; i < n; i++) {
            pre = curr;
            curr = new StringBuilder();
            say = pre.charAt(0);
            for(int j = 1;j<pre.length();j++){
                if(pre.charAt(j)!=say){
                    curr.append(count).append(say);
                    say = pre.charAt(j);
                    count = 1;
                }else{
                    count++;
                }
            }
            curr.append(say).append(count);
        }
        return curr.toString();
    }
}
