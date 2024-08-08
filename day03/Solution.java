package day03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = sc.next();
        System.out.println("반복 횟수를 설정하세요.");
        int n = sc.nextInt();
        for(int i = 1; i < n+1; i++){
            System.out.print(str);
        }
    }
}