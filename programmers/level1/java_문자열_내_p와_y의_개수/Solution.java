package level1.java_문자열_내_p와_y의_개수;

class Solution {
    
    boolean solution(String s) {
        
        String y = s.replaceAll("[^pP]", "");
        String p = s.replaceAll("[^yY]", "");
        
        return y.length() == p.length() ? true : false;
    }
}