package Day0122;
// BMI 계산기에 메뉴를 적용시켜 프로그램을 완성시키시오(30분)
// BMI 계산 방법은 몸무게 / 키 / 키 입니다.

import java.util.Scanner;
public class Ex04BMI {
    
        //사용자의 최대 키 값
        static final double MAX_HEIGHT = 2.72;
        //사용자의 최대 몸무게 값
        static final double MAX_WEIGHT = 465;
        // 저체중 BMI 값
        static final double LOW_WEIGHT_BMI = 18;
        // 정상체중 BMI 값
        static final double NORMAL_WEIGHT_BMI = 23;
        // 과체중 BMI 값
        static final double OVER_WEIGHT_BMI = 25;
        // 입력 옵션값
        static final int OPTION_INSERT = 1;
        // 출력 옵션값
        static final int OPTION_PRINT = 2;
        // 종료 옵션값
        static final int OPTION_END = 3;
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double weight = 0;
        double height = 0;
        
        
        
        while(true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int userChoice = scan.nextInt();
            
            if(userChoice == OPTION_INSERT) {
                //입력하는 코드 구현
                
                
                System.out.print("키(m): ");
                height = scan.nextDouble();
                while( height <= 0 || height > MAX_HEIGHT) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("키(m): ");
                    height = scan.nextDouble();
                }
                
                System.out.print("몸무게(kg): ");
                weight = scan.nextDouble();
                while(weight <= 0 || weight > MAX_WEIGHT);{
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("몸무게(kg): ");
                    weight = scan.nextDouble();
                }
                
                
                
            }else if(userChoice == OPTION_PRINT) {
                //출력하는 코드 구현
                
                if(weight == 0) {
                    // 아직 입력된 값이 없다라는 의미이므로
                    // 경고메시지만 출력
                    System.out.println("아직 입력된 값이 없습니다.");

                
                double bmi = weight / height / height;
                
                    
                    if (bmi < LOW_WEIGHT_BMI) {
                        System.out.println("저체중 입니다.");
                    }else if (bmi < NORMAL_WEIGHT_BMI) {
                        System.out.println("정상체중 입니다.");
                    }else if (bmi < OVER_WEIGHT_BMI) {
                        System.out.println("과체중 입니다.");
                    }else {
                        System.out.println("비만 입니다.");
                    }
                    
                    
                    
                }else if(userChoice == OPTION_END) {
                //종료
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
              
                    
            }
        
        
        
        
        scan.close();
    }

    }
}
