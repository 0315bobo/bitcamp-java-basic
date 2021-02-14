package Day0121;
import java.util.Scanner;
public class Hw01t {
    static final int MIN_BMI = 18;
        static final int MAX_BMI = 23;
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("키를 m단위로 입력하세요. ");
        double height = scanner.nextDouble();

        while (height < 0 || height > 2.72) {
            
            System.out.println("잘못입력하셨습니다.");
            System.out.println("키를 m단위로 입력하세요.");
            height = scanner.nextDouble();

        }

        // while문이 종료되었다
        // = while의 조건이 false가 되었다
        // = height의 값이 0~2.72 사이이다.

        System.out.println("몸무게를 kg단위로 입력하세요.");
        double weight = scanner.nextDouble();
        while (weight < 0 || weight > 465) {
            System.out.println("잘못입력하셨습니다.");
            System.out.println("키를 m단위로 입력하세요.");
            weight = scanner.nextDouble();

        }
        
        

        double BMI = weight / height / height;
        
        System.out.printf("당신의 BMI:%.2f\n ", BMI);
        
        if (BMI < MIN_BMI) {
            System.out.println("저체중");
        } else if (BMI < MAX_BMI) {
            System.out.println("정상체중");
        } else if (BMI < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }

        scanner.close();

    }

}

