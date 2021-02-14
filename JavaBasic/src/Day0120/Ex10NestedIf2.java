package Day0120;
// 사용자로부터
// 성별 - 나이 - 신체등급 순으로 입력 받아서
// 현역 - 공익 - 면제 를 출력하는 프로그램
// 1. 단 성별은 1이 남자 2가 여자 int로 입력을 받되
//    여자일 경우 "여성에게는 국방의 의무가 부여되지 않습니다."
//    라는 메시지만 출력되고 프로그램이 종료되게 작성하시오
// 2. 남자이지만 미성년자일 경우
//    "아직 미성년자에게는 신체등급이 부여되지 않습니다."
//    라는 메시지만 출력되고 프로그램이 종료되게 작성하시오
// 3. 남자이고 성인일 경우에만 신체등급을 입력 받아서
//    결과가 출력되게 만들어주세요.
import java.util.Scanner;
public class Ex10NestedIf2 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("남자면 1 여자면 2: ");
       int gender = scanner.nextInt();
       
       if (gender == 2) {
           System.out.println("여성에게는 국방의 의무가 부여되지 않습니다.");
       }else {
           System.out.println("나이: ");
           int age = scanner.nextInt();
           if (age < 20) {
               System.out.println("아직 미성년자에게는 신체등급이 부여되지 않습니다.");
           }else {
               System.out.println("신체등급: ");
               int category = scanner.nextInt();
               if (category <= 3) {
                   System.out.println("현역 입니다.");
               }else if (category == 4) {
                   System.out.println("공익 입니다.");
               }else {
                   System.out.println("면제 입니다.");
               }
           }
           
       }
       
       
       
       
       System.out.println("시스템 종료");
       
       
       scanner.close();
   }
}
