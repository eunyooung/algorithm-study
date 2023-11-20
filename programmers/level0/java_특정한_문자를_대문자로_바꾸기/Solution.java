package level0.java_특정한_문자를_대문자로_바꾸기;

class Solution {
    
    public String solution(String my_string, String alp) {
        
        return my_string.replaceAll(alp, alp.toUpperCase());
    }
}
