package level1.java_직사각형_별찍기;

import java.util.Scanner;

class Solution {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            String line = "*".repeat(a);
            
            for (int i = 0; i < b; i++) {
                
                System.out.println(line);
            }
        }
    }
}
