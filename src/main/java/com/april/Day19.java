package com.april;

/**
 * Created by daixn on 2021/4/19 23:13
 */
public class Day19 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("cacaddaaa"));
        ;
    }
    public static String removeDuplicates(String S) {
        if (S == null || S.length()<=1) {
            return S;
        }
        StringBuffer sb = new StringBuffer();

        int last=-1;
        for (int i = 0; i < S.length(); i++) {
            if(sb.length()!=0&&S.charAt(i)==sb.charAt(last)){
                sb.deleteCharAt(last);
                last--;
            }else{
                sb.append(S.charAt(i));
                last++;
            }
        }
        return sb.toString();
    }
}
