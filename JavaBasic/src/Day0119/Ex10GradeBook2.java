package Day0119;
// 사용자로부터
// 나이 이름
// 국어 영어 수학
// 순으로 입력 받아서
// 나이, 이름, 국어, 영어, 수학, 총점, 평균
// 이 출력되는 프로그램을 작성하시오 (50분까지)

import java.util.Scanner;
public class Ex10GradeBook2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        //나이 입력
        System.out.println("나이: ");
        int age = scanner.nextInt();
        
        //이름 입력
        System.out.println("이름: ");
        scanner.nextLine();   
        String name = scanner.nextLine();
        
        //국어 입력
        System.out.println("국어: ");
        int korean = scanner.nextInt();
        //영어 입력
        System.out.println("영어: ");
        int english = scanner.nextInt();
        //수학 입력
        System.out.println("수학: ");
        int math = scanner.nextInt();
        
        
        System.out.println("나이: "+age);
        System.out.println("이름: "+name);
        System.out.println("국어: "+korean);
        System.out.println("영어: "+english);
        System.out.println("수학: "+math);

        
        int sum = korean + english + math;
        double average = sum / 3.0;
        
        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);
        
        
        
        scanner.close();
    }
}


// 근데 콘솔에 뜬거 숫자 너무 지저분하지 않아? 예쁘게 출력하는 법..다음거 ㄱㄱ