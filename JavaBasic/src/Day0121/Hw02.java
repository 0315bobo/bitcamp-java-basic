package Day0121;

//숙제 2: 사용자로부터 점수를 입력 받아 A, B, C, D, F 를 출력하는 프로그램을
//작성하세요. 단 잘못된 점수가 입력되면 올바른 점수가 입력될때까지
//다시 입력을 받으세요

import java.util.Scanner;
public class Hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("점수를 입력해주세요: ");
        int score = scanner.nextInt();
        if(score >= 0 && score <= 100) {
            // 올바른 범위이므로 출력 시작
            
            if(score >= 90) {
                System.out.println("A");
            }else if( score >= 80){
                System.out.println("B");
            }else if( score >= 70){
                System.out.println("C");
            }else if( score >= 60){
                System.out.println("D");   
            }else {
                System.out.println("F");
            }
            
        } else {
            System.out.println("잘못된 점수의 형태입니다.");
        }
        
        
        
        
        scanner.close();
    }
}
