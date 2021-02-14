package Day0121;

//숙제 3: 사용자가 번호, 이름, 국어, 영어, 수학 점수를 입력하면
//예쁘게 출력하는 프로그램을 작성하세요. 
//단 사용자가 잘못된 형태의 점수를 입력하면 올바른 형태의 점수를 
//입력할 때 까지 다시 입력을 받는 프로그램을 만드세요.

//예시)
//번호: 002번 이름: 조재영
//국어: 004점 영어: 002점 수학: 001점
//총점: 007점 평균: 02.33점

//심화: 모든 숙제에 대해 하드코딩이 아닌 소프트코딩을 적용시키세요.
import java.util.Scanner;
public class Hw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("번호: ");
        int number = scanner.nextInt();
        
        System.out.println("이름: ");
        scanner.nextLine();   
        String name = scanner.nextLine();
        
        System.out.println("국어: ");
        int korean = scanner.nextInt();
        
        System.out.println("영어: ");
        int english = scanner.nextInt();
        
        System.out.println("수학: ");
        int math = scanner.nextInt();
        
        int sum = korean + english + math;
        double average = sum / 3.0;
        
        
        System.out.printf("번호: %03d", number);
        System.out.println("이름: "+ name);
        System.out.printf("국어: %03d", korean);
        System.out.printf("영어: %03d", english);
        System.out.printf("수학: %03d", math);
        System.out.printf("총점: %03d", sum);
        System.out.printf("평균: %.2d", average); //????
        
        
        scanner.close();
    }
}
