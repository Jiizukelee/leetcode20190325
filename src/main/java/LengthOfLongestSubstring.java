import java.util.HashSet;
import java.util.Set;

/*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

        示例 1:

        输入: "abcabcbb"
        输出: 3
        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
        示例 2:

        输入: "bbbbb"
        输出: 1
        解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
        示例 3:

        输入: "pwwkew"
        输出: 3
        解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
        请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s){
        int size = s.length();
        int max = 0;
        for (int i = 0; i < size ; i++) {
            for (int j = i+1; j <= size; j++) {
                if(uniqueSubstring(s,i,j)){
                    int len = j-i;
                    max = Math.max(max, len);
                }
            }
        }
        System.out.println(max);
        return max;
    }



    public boolean uniqueSubstring(String s,int start,int end){
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end ; i++) {
            Character ch = s.charAt(i);
            System.out.println(ch);
            if (set.contains(ch)){
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}