package Day0121;
// 별찍기 2번
import java.util.Scanner;
public class StarPrinter02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("*****별찍기 2번*****");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scan.nextInt();
        
        for (int i = 1; i <= userNumber; i++ ) {
            String stars = new String();
            
            //userNumber가 5일때!
            //i가 1일때
            //j는 1로 초기화하고 5(userNumber)보다 작거나 같을 동안
            // 1 한번 2 두번 3 세번 4네번 5 다섯번 -> * 5개
            
            //i가 2일때
            //j는 2로 초기화하고 5보다 작거나 같을 동안
            // 2 한번 3두번 4세번 5네번 -> * 4개
         //   for (int j = 1; j <= 5; j++)
         //   for (int j = 2; j <= 5; j++)    
         //   for (int j = 3; j <= 5; j++) 
         //   for (int j = 4; j <= 5; j++)  
         //   for (int j = 5; j <= 5; j++)
            //->i가 1일 때 총 이렇게 5번 -> *이 5개!
            
            for (int j = i; j <= userNumber; j++) {
                stars += "*";
            } // 여기서 왜 <= userNumber 인거냐면
              // 그줄에 별이 나오는 개수에서 점점 작아지는 식이라서
            
            System.out.println(stars);
        }
        
        
        scan.close();
    }
}
