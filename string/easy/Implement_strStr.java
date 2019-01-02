package easy;

/**
 * @author:feipeng
 * @description:
 * @date:2019/1/2 12:14
 */
public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        if(needle == null||needle.isEmpty()){
            return 0;
        }
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        for(int i=0;i<haystackLength;i++){
            if(haystackLength-i < needleLength){
                return -1;
            }
            if(haystack.substring(i,i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        int l1=haystack.length(),l2=needle.length();
        if(l1<l2){
            return -1;
        }else if(l2 ==0){
            return 0;
        }
        int threshold=l1-l2;
        for(int i=0;i<=threshold;i++)
        {
            if(haystack.substring(i,i+l2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
