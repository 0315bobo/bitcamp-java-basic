package Day0122;
//별찍기 9번
import java.util.Scanner;
public class StarPrinter09Hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        System.out.println("******별찍기 09번******");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scan.nextInt();
        
        
        // 위 작은 세모
        for (int i = 1; i <= userNumber - 1 ; i++ ) {
            
           String stars = new String();
           //공백
           for (int j = i; j < userNumber; j++) {
                stars += " ";
            }
           //별 
           for (int j = 1; j <= 1+2*(i-1); j++) {
               stars += "*";
           }
            System.out.println(stars);
        }
        
        // 아래 큰 세모
        for(int i = userNumber; i >= 1; i--) {
            String stars = new String();
            //공백
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            //별
            for(int j = 1; j <= 2*i-1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        
        
        
        scan.close();
    }    
}
