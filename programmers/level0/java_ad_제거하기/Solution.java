package level0.java_ad_제거하기;

import java.util.*;

class Solution {
    
    public String[] solution(String[] strArr) {
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < strArr.length; i++) {
            
            if (!strArr[i].contains("ad")) {
                list.add(strArr[i]);
            }
        }
        
        return list.toArray(new String[list.size()]);
    }
}
