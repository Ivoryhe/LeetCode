public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String result = "";
        if(len == 0) {return result;}
        if(len == 1) {return strs[0];}
        char[] ch = strs[0].toCharArray();
        int num = 0;
        OUT:
        for(int i=0; i<strs[0].length(); i++){
            char c = ch[i];
            for(int j=1; j<strs.length; j++){
                if(strs[j].length()-1 < i || strs[j].charAt(i) != c){
                    num = i;
                    break OUT;
                }
            }
            num = i+1;
        }
        return strs[0].substring(0,num);
    }
}