package easy;

/**
 * Author:Fmb
 * Description:
 * Date:9:58 2018/12/10
 * Modified By：
 */
public class AddBinary {

    public static void main(String[] args) {
        String a="1";
        String b="111";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b){
        if(a == null||a.length() == 0){
            return b;
        }
        if(b == null||b.length() == 0){
            return a;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        int i=aArray.length-1;
        int j=bArray.length-1;
        int aByte;
        int bByte;
        int result;
        int carry = 0;
        StringBuilder stringBuilder =new StringBuilder();
        while(i>-1||j>-1||carry==1){
            aByte = (i>-1)?Character.getNumericValue(aArray[i--]):0;
            bByte = (j>-1)?Character.getNumericValue(bArray[j--]):0;
            result = (aByte+bByte+carry)%2;
            carry = (aByte+bByte+carry)/2;
            stringBuilder.append(result);
        }
        return stringBuilder.reverse().toString();
    }
}
