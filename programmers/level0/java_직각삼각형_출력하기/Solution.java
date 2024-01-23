package level0.java_직각삼각형_출력하기;

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }

        sc.close();
    }
}
