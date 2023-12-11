package level0.java_문자열_바꿔서_찾기;

class Solution {
    
    public int solution(String myString, String pat) {
        
        String str = "";
        
        for (int i = 0; i < myString.length(); i++) {
            
            str += myString.charAt(i) == 'A' ? "B" : "A";
        }
        
        return str.contains(pat) ? 1 : 0;
    }
}
