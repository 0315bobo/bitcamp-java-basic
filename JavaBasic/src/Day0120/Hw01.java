package Day0120;
//숙제1. 사용자로부터 키와 몸무게를 입력받아서
//BMI 수치를 어느정도 형식에 맞추어 출력하시오
//BMI 계산 방법은 몸무게 / 키 / 키 입니다.

import java.util.Scanner;
public class Hw01 {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("키를 m 단위로 입력해주세요: ");
        double height = scanner.nextDouble();
        
        System.out.printf("몸무게를 kg 단위로 입력해주세요: ");
        double weight = scanner.nextDouble();
        
        double bmi = weight / height / height;
        
        System.out.printf("사용자의 BMI 수치는 "+bmi);
        
                
                
                
                
                
                
        scanner.close();
    }
}
