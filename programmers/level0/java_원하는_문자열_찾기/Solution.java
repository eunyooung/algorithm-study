package level0.java_원하는_문자열_찾기;

class Solution {
    
    public int solution(String myString, String pat) {
        
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
