package level1.java_핸드폰_번호_가리기;

class Solution {
    
    public String solution(String phone_number) {
        String stars = "";
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            stars += "*";
        }
        return stars + phone_number.substring(phone_number.length() - 4, phone_number.length());
    }
}