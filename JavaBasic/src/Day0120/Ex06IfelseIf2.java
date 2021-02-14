package Day0120;
// 1. 사용자로부터 숫자를 입력받아서
//    해당 숫자가 한자리, 두자리, 세자리, 네자리 이상의 숫자 중 어떤 것인지
//    보여주는 프로그램
// 2. 사용자로부터 나이를 입력 받아서
//    ~5: 영아
//    ~13: 어린이
//    ~18: 청소년
//    19~: 성인
//    이 출력되는 프로그램
// 3. 사용자로부터 점수를 입력 받아서
//    90점대이상: A
//    80점대: B
//    70점대: C 
//    60점대: D 
//      그외: F
//    가 출력되는 프로그램

import java.util.Scanner; 
public class Ex06IfelseIf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1. 자릿수
        System.out.println("숫자: ");
        int number = scanner.nextInt();
        
        if(number < 10) {
            System.out.println("한자리 숫자입니다.");
        }else if(number < 100) {
            System.out.println("두자리 숫자입니다.");
        }else if(number < 1000) {
            System.out.println("세자리 숫자입니다.");
        }else {
            System.out.println("네자리 이상 숫자입니다.");
        }
        
        
        scanner.close();
}
}