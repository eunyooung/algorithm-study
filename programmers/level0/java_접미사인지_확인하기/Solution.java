package level0.java_접미사인지_확인하기;

class Solution {
    
    public int solution(String my_string, String is_suffix) {
        
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }
}
