package easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * Author:Fmb
 * Description:
 * Date:13:48 2018/12/10
 * Modified By：
 */
public class ValidParentheses {
    public static boolean validParentheses(String s){
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(map.keySet().contains(curr)){
                stack.push(curr);
            }else if(map.values().contains(curr)){
                if(!stack.empty()&&map.get(stack.peek())==curr){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
