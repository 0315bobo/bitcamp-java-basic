package Day0122;
//BMI 계산기에 메뉴를 적용시켜 프로그램을 완성시키시오(30분)

import java.util.Scanner;
public class Ex04BMIT{
 // 사용자의 최대 키 값
 static final double MAX_HEIGHT = 2.72;
 // 사용자의 최대 몸무게 값
 static final double MAX_WEIGHT = 465;
 // 저체중 BMI 값
 static final double LOW_WEIGHT_BMI = 18;
 // 정상체중 BMI 값
 static final double NORMAL_WEIGHT_BMI = 23;
 // 과체중 BMI 값
 static final double OVER_WEIGHT_BMI = 25;
 
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double height = 0;
     double weight = 0;
     
     while(true) {
         System.out.println("1. 입력 2. 출력 3. 종료");
         int userChoice = scanner.nextInt();
         
         if(userChoice == 1) {
             //입력 코드 구현
             System.out.print("키를 m단위로 입력해주세요: ");
             height = scanner.nextDouble();
             while(height <= 0 || height > MAX_HEIGHT) {
                 System.out.println("잘못된 값입니다.");
                 System.out.print("키를 m단위로 입력해주세요: ");
                 height = scanner.nextDouble();
             }
             
             System.out.print("몸무게를 kg단위로 입력해주세요: ");
             weight = scanner.nextDouble();
             while(weight <= 0 || weight > MAX_WEIGHT) {
                 System.out.println("잘못 입력하셨습니다.");
                 System.out.print("몸무게를 kg단위로 입력해주세요: ");
                 weight = scanner.nextDouble();
             }
             
         }else if(userChoice == 2) {
             //출력 코드 구현
             
             if(weight == 0) {
                 // 아직 입력된 값이 없다라는 의미이므로
                 // 경고메시지만 출력
                 System.out.println("아직 입력된 값이 없습니다.");
             }else {
                 double bmi = weight / height / height;
                 if(bmi < LOW_WEIGHT_BMI) {
                     System.out.println("저체중");
                 }else if(bmi < NORMAL_WEIGHT_BMI) {
                     System.out.println("정상체중");
                 }else if(bmi < OVER_WEIGHT_BMI) {
                     System.out.println("과체중");
                 }else {
                     System.out.println("비만");
                 }
             }
             
             
             
         }else if(userChoice == 3) {
             System.out.println("사용해주셔서 감사합니다.");
             break;
         }
         
     }
     
     
     scanner.close();
 }
}
