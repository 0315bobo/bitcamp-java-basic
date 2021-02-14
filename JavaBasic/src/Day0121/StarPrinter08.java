package Day0121;
import java.util.Scanner;
public class StarPrinter08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //사용자 숫자 입력
        System.out.println("*****별 찍기 8번*****");
        System.out.print("출력할 줄 수를 입력해주세요: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2*userNumber - 1; i++) {
            String stars = new String();
            
           if(i <= userNumber - 1) {
               // 윗부분
                
               // 공백을 담당하는 j for문 
               for(int j = 1; j <= userNumber - i; j ++ ) {
                   stars += " ";
               }
               
               
               // 별을 담당하는 j for문
               for(int j = 1; j <= i; j++) {
                   stars += "*";
               }
               
               
            }else {
               // 아랫부분
                int lowerI = i - userNumber + 1;
                
                //공백을 담당하는 j for 문
                for(int j =1; j <= lowerI - 1; j++) {
                    stars += " ";
                }
                
                //별을 담당하는 j for 문
                for(int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
                
            }
            
            
            
            
            
            
            System.out.println(stars);
        }
           
        
        scanner.close();
    }// 메인함수 종료
}//클래스 종료