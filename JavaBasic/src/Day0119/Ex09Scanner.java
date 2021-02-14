package Day0119;
// Scanner 클래스 [nextInt(), nextDouble()]
// Scanner 클래스의 변수는
// 자바의 각종 입력을 처리한다.
// 우리는 그중에서 키도브 입력 처리를 배워보도록 하겠다.

// 단, Scanner 클래스는 자바에서 제공해주지만 기본 라이브러리에 포함되지 
// 않으므로, 우리가 사용할려면 반드시 우리의 클래스에 "수입" 해와야 한다.
// 수입 방법은 import java.util.Scanner 라고 적어주어야 한다.

// 오늘 배운거 Ex01~08 외의 것들은 수입해와야 하는 것임. 
// 그니께 Scanner를 배워보자!
import java.util.Scanner;
public class Ex09Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // (System.in); -> 임시로 버퍼메모리에 저장
        // nextInt() -> 이안의 값을 가져옴.
        // int? 숫자(혹은 -숫자)로만 이루어짐.
        // 이때 소숫점이 포함하여 숫자, 숫자.숫자, -숫자.숫자, -숫자 이런 식이면 double도 가능.
        
        // scanner란 친구는
        // 1. 키보드 입력값을 String으로 읽어옴.
        // 2. 읽어온 String 값이 내가 호출한 메소드의 패턴과
        //    일치하는지 체크.
        // 3. 일치하면 내가 원하는 데이터타입으로 변환.
        // 4. 일치하지 않으면? 에러
        
        
        
        // 1. int 를 입력 받을 때에는 Scanner 변수의
        //    nextInt() 메소드를 실행하면 된다.
        System.out.println("숫자를 입력해주세요.");
        int number = scanner.nextInt();
        System.out.println("사용자가 입력한 숫자: "+number);
        
        // 2. double을 입력 받을 때에는 Scanner 변수의
        //    nextDouble() 메소드를 실행하면 된다.
        System.out.println("실수를 입력해주세요.");
        double d = scanner.nextDouble();
        System.out.println("사용자가 입력한 실수: "+ d);
        
        // 3. String을 입력 받을 때에는 Scanner 변수의
        // newtLine() 메소드를 실행하면 된다.
        
     //   System.out.println("이름을 입력해주세요.");
     //   String name = scanner.nextLine();
     //   System.out.println("사용자의 이름: "+name);
        // -> 입력 자체가 안되고 바로 빈 공간이 뜬다.
        // 엔터키도 하나의 문자이다! 스페이스도 마찬가지.
        // 마지막에 남은 엔터키의 앞뒤 공백 빼면 "" 그냥 빈공간. 역사 깊은 자바 버그임.
        // -> 이 때 버퍼 메모리는 깨끗하게 빈 상태가 된다.
        
        // 단, nextInt(), nextDouble() 등의 숫자를 입력 받는 메소드는
        // 버퍼메모리에 엔터키 (+개행문자)를 남겨두고
        // 그 다음에 실행되는 nextLine() 메소드는 남겨진 엔터키를 보고
        // 사용자가 입력을 종료시켰다 라고 착각하게 된다.
        // 이 착각 때문에 우리는 아무런 String 입력을 할 수 없게 된다.
        // 따라서 우리는 버퍼메모리 안의 엔터키를 없애주기 위해서
        // 진자 스트링 입력을 위한 nextLine() 전에
        // 비워주는 nextLine() 을 한번 실행시켜주어야 한다!!!!
        
        // 다시 적어보자 제대로. 
        
        System.out.println("이름을 입력해주세요.");
        scanner.nextLine();   //-> 여기서 엔터키를 가져가면 깨끗하게 비겠지.
        String name = scanner.nextLine();
        System.out.println("사용자의 이름: "+name);
        
        
        scanner.close();
        
    }

}


















