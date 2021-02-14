package Day0121;
//숙제 1: BMI 계산기를 만들어서 사용자의 BMI 수치와 현채 체중 상태를
//출력하는 프로그램을 작성하시오.
//단 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지
//다시 입력을 받으세요.

import java.util.Scanner;
public class Hw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("몸무게(kg): ");
        double weight = scanner.nextDouble();
        
        if (weight > 0 && weight <= 465) {
            System.out.print("잘못된 몸무게를 입력하셨습니다.");
            System.out.print("몸무게(kg)를 다시 입력해주세요: ");
        }
        
        System.out.printf("키(m): ");
        double height = scanner.nextDouble();
        
        if (height < 0 && height > 2.72) {
            System.out.print("잘못된 키를 입력하셨습니다.");
            System.out.print("키(m)를 다시 입력해주세요: ");
        }
        
        
        double bmi = weight / height / height;
        
        if ( bmi < 18.5) {
            System.out.println("저체중 입니다.");
        }else if (bmi < 23) {
            System.out.println("정상체중 입니다.");
        }else if (bmi < 25) {
            System.out.println("과체중 입니다.");
        }else {
            System.out.println("비만 입니다.");
        }
        
        
        
        
        
        scanner.close();
    }
}
