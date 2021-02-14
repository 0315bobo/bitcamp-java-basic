package Day0121;
//숙제2: 사용자로부터 점수를 입력받아 A,B,C,D,F를 출력하는 프로그램을 작성하세요. 
//단 잘못된 점수가 입력되면 올바른 점수가 입력될때까지 다시 입력을 받으세요.

import java.util.Scanner;
public class Hw002 {  
    static final int SCORE_LIMIT_MAX = 100;
    static final int SCORE_LIMIT_A = 90;
    static final int SCORE_LIMIT_B = 80;
    static final int SCORE_LIMIT_C = 70;
    static final int SCORE_LIMIT_D = 60;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력해주세요: ");
        int score = scanner.nextInt();
        
        while(score < 0 || score > SCORE_LIMIT_MAX ) {
            System.out.println("잘못된 점수입니다. 다시 입력해주세요.");
            System.out.print("점수를 입력해주세요: ");
            score = scanner.nextInt();
        }
  
            if(score >= SCORE_LIMIT_A) {
                System.out.println("A");
            }else if(score >= SCORE_LIMIT_B) {
                System.out.println("B");
            }else if(score >= SCORE_LIMIT_C) {
                System.out.println("C");
            }else if(score >= SCORE_LIMIT_D) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
        scanner.close();
    }
}
