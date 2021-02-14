package Day0120;
//숙제3. 사용자로부터 생년, 생월, 생일을 따로따로 입력 받아서
//형식에 맞추어 출력해보도록 합니다.
//심화과정: 사용자가 생년, 생월, 생일을 따로따로 입력하면
//      주민등록번호의 앞자리처럼 처리를 해봅시다.
import java.util.Scanner;
public class Hw03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int year, month, day;
        
        System.out.print("태어난 년도: ");
        year = scan.nextInt();
        System.out.print("태어난 달: ");
        month = scan.nextInt();
        System.out.print("태어난 날: ");
        day = scan.nextInt();
        
        System.out.println("당신은 "+year+"년 "+month+"월 "+day+"일에 태어났습니다.");
        System.out.printf("당신의 주민번호 앞자리는 %02d%02d%02d", year % 100, month, day);
        
   

        
        // 999/100 => 19
        // 999 % 100 => 99
        
        
        scan.close();
    }
}
