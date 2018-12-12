package easy;

/**
 * @author:feipeng
 * @description:
 * @date:2018/12/12 19:40
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs={"flower","floor","flavorate"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        if(strs.length ==1){
            return strs[0];
        }
        //计算出数组中的最短字符串
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLength){
                minLength = strs[i].length();
            }
        }
        //在最短字符串的长度限制内，两两依次进行匹配
        for(int i=0;i<minLength;i++){
            for(int j=0;j<strs.length-1;j++){
                String str1 = strs[j];
                String str2 = strs[j+1];
                if(str1.charAt(i)!=str2.charAt(i)){
                    return str1.substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLength);
    }
}
