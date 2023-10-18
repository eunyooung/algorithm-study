package level0.java_특정_문자_제거하기;

class Solution {
    
    public String solution(String my_string, String letter) {
        
        return my_string.replaceAll(letter, "");
    }
}
