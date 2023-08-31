package level1.java_푸드_파이트_대회;

class Solution {
    
    public String solution(int[] food) {
        
        String str = "";
        
        for (int i = 1; i < food.length; i++) {
            
            if (food[i] == 1) {
                continue;
            }
            
            str += Integer.toString(i).repeat(food[i] / 2);
        }
        
        String strReverse = new StringBuffer(str).reverse().toString();
        return str + "0" + strReverse;
    }
}
