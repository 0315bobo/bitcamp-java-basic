package Day0120;


import java.util.Scanner;
public class Ex04Ifelse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //1. 사용자로부터 숫자를 입려 받아서 홀수이면 홀수입니다가 출력되게 작성해보시오
        
        System.out.println("숫자를 입력하세요.");
        int number = scanner.nextInt();
        
        if(number % 2 == 1) { 
            System.out.println("홀수입니다.");
        }else {
            System.out.println("짝수입니다.");
        }
        
        System.out.println("프로그램 종료");
        
        //2. 나이를 입력 받아서 성인인지 미성년자인지 출력하는 코드를 작성하시오
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();
        
        if(age >= 19) { 
            System.out.println("성년입니다.");
        }else {
            System.out.println("미성년자 입니다.");
        }
        System.out.println("프로그램 종료");
        
        //3. 사용자로부터 id와 비밀번호를 입력 받아서
        //   id가 admin, 비밀번호가 12345가 맞으면 로그인 성공
        //   그 외에는 로그인 실패가 출력되는 코드를 작성하시오
        System.out.print("ID: ");
        scanner.nextLine();
        String id = scanner.nextLine();
        
        System.out.print("PW: ");
        String password = scanner.nextLine();
        
        if(id.equals("admin") && password.equals("12345")) { 
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }
        System.out.println("프로그램 종료");
        
        scanner.close();
}
}
