package level1.java_숫자_문자열과_영단어;

public class Solution {
    public int solution(String s) {
        
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < arr.length; i++) {

            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        
        return Integer.valueOf(s);
    }
}