import java.util.Stack;
/**
 * Feb-18-2014
 * @author Ivoryhe
 * Valid Parentheses
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        if(ch.length == 0){return true;}
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0; i<ch.length; i++){
            if(stack.empty()){
                if(ch[i] == ')' || ch[i] == ']' || ch[i] == '}'){
                    return false;
                }
                else{
                    stack.push(ch[i]);
                }
            }
            else{
                if(ch[i] == '(' || ch[i] == '[' || ch[i] == '{'){
                    stack.push(ch[i]);
                }
                else{
                    if(ch[i] == ')'){
                        char temp = stack.pop();
                        if(temp != '('){
                            return false;
                        }
                    }
                    else if(ch[i] == '}'){
                        char temp = stack.pop();
                        if(temp != '{'){
                            return false;
                        }
                    }
                    else{
                        char temp = stack.pop();
                        if(temp != '['){
                            return false;
                        }
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}