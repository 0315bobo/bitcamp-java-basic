package Day0122;
//별찍기 9번 => Hint: StarPrinter 5번이랑 6번 합친 모양임.
import java.util.Scanner;
public class StarPrinter09T {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("******별찍기 09번******");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scan.nextInt();
        
        
        for(int i = 1; i <= 2*userNumber - 1; i++) {
            String stars = new String();
            if( i <= userNumber - 1) {
                //작은 윗부분
                
                //공백을 담당하는 j for 문
                for (int j=1; j <= userNumber - i; ++j) { 
                    //-> for(int j = i; j <= userNumber-1; j++) 도 가능!!
                    stars += " ";
                }
                
                //별을 담당하는 j for 문
                for (int j= 1; j <=2*i - 1; j++) {
                    stars += "*";
                }
                
            } else{
                //큰 아랫부분
                //    i -> 5 6 7 8 9 들어올 수 있겠지?
                // lowI -> 5 4 3 2 1 
                // 로 나와야 하는데 어떻게 이렇게 바꿀 수 있을까? 
                // 2*userNumber - 1
                // 하면 됨.
                
                int lowI = 2*userNumber - i;
                
                // 공백을 담당하는 j for 문
                for(int j = 1; j <= userNumber - lowI; j++) {
                    stars += " ";
                }
                // 별을 담당하는 j for 문
                for(int j = 1; j <= 2*lowI - 1; j++) {
                    stars += "*";
                }
                 
                 
            }     
            System.out.println(stars);
            
             
        
        }
        
        
        scan.close();
    
    }

}