package level2.java_이진_변환_반복하기;

class Solution {
    
    public int[] solution(String s) {
        
        int count = 0;
        int totalZeros = 0;
        
        while(!s.equals("1")) {
            
            String str = s.replaceAll("0", "");
            int sLength = s.length();
            int strLength = str.length();
            
            s = Integer.toBinaryString(strLength);
            
            totalZeros += sLength - strLength;
            count++;
        }
        
        return new int[] {count, totalZeros};
    }
}
