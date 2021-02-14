package Day0121;
// 1. 1부터 10까지 출력되는 for문을 작성하시오
// 2. 8부터 3까지 출력되는 for문을 작성하시오
// 3. 사용자로부터 시작 숫자와 끝 숫자를 입력 받아서
//    그 숫자들을 차례대로 출력하시오
// 4. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수까지의 홀수들만 출력하시오
// 5. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수까지의 합을 구하시오
// 6. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수까지의 곱을 구하시오
// 11시 20분까지
// 힌트: 5번과 6번은 변수의 선언 위치를 고민해보시오 

import java.util.Scanner;
public class Ex02For2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
     // 1. 1부터 10까지 출력되는 for문을 작성하시오
        System.out.println("--------1번------------");
        int start = 1;
        int end = 10;
        
        for(int i = start; i <= end; i++) {
            System.out.println(i);
        }
        
        
        System.out.println("--------------------");
     // 2. 8부터 3까지 출력되는 for문을 작성하시오
         System.out.println("--------2번------------");
         start = 8; //-> 여기서 왜 int 안쓰냐면 1번에서 이미 선언했기 때문. 또 int 쓰면 중복 선언이 되어 버린다!!
         end = 3; // -> 즉 여기서 부터는 새로운 값을 선언해준겨 각각 8과 3이라고.
         for(int i = start; i >= end; i--) {
         System.out.println(i);
        }
        
        
        System.out.println("--------------------");
     // 3. 사용자로부터 시작 숫자와 끝 숫자를 입력 받아서
     //   숫자들을 차례대로 출력하시오
        System.out.println("--------3번------------");
        
        System.out.print("시작 숫자: ");
        start = scan.nextInt();
        System.out.print("끝 숫자: ");
        end = scan.nextInt();
        if(start <= end) {
            for( int i = start; i <= end ; i++) {
                 System.out.println(i);
            }
        }else { //-> 반대로 내려가고 싶다면 이렇게 하면 되지롱.
            for( int i = start; i >= end ; i--) {
                System.out.println(i);
        }
        }
        
        System.out.println("--------------------");
     // 4. 사용자로부터 숫자를 하나 입력 받아서
     //    1부터 그 수까지의 홀수들만 출력하시오
        System.out.println("--------4번------------");
        start = 1;
        System.out.print("숫자: ");
        end = scan.nextInt();
        
            for (int i = start;i <= end ; i++) { //-> 여기서 아래 if문 지우고 제어변수 변화식을 i += 2로 해도 됨.
                 if (i % 2 == 1) {               
                     System.out.println(i);
                 }
        }  
        
        
        System.out.println("--------------------");
     // 5. 사용자로부터 숫자를 하나 입력 받아서
     //    1부터 그 수까지의 합을 구하시오
        System.out.println("--------5번------------");
        start = 1;
        System.out.print("숫자: ");
        end = scan.nextInt();
        int sum = 0; // -> for문 안에 선언하면 계속 초기화만 되고 값 저장이 안된다.
        for (int i = start; i <= end ; i++) {
            sum += i;
        }
        System.out.printf("1부터 %d 까지의 합: %d\n", end, sum);
        
        System.out.println("--------------------");
     // 6. 사용자로부터 숫자를 하나 입력 받아서
     //    1부터 그 수까지의 곱을 구하시오
        System.out.println("--------6번------------");
        start = 1;
        System.out.println("숫자: ");
        end = scan.nextInt();
        int factorial =1;
        
        if(end >= 13) {
            System.out.println("오버플로우가 발생하여 정확한 결과를 출력할 수 없습니다.");
        }else {
            for(int i = start; i <= end; i++) {
            factorial *= i;
            }
        }
        
        System.out.printf("1부터 %d까지의 곱: %d\n", end, factorial);
        
        scan.close();
    }
}
