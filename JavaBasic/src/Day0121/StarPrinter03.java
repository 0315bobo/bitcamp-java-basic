package Day0121;
//별찍기 3번
import java.util.Scanner;
public class StarPrinter03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("*****별찍기 3번*****");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scan.nextInt();
        
        
        for (int i = 1; i <= userNumber ; i++) {
             String stars = new String();
            
            
            // 공백을 담당하는 j for 문
             for (int j = 1; j <= userNumber - i; j++ ) {
                 stars += " ";
             } 
             
            // for (int j = i; j < userNumber; j++ ) {
            //  stars += " ";
            // } 
            // -> 이렇게도 가능.
             
             
             
            // 별을 담당하는 j for 문
             for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            
             System.out.println(stars);
        
        }
        
        
        scan.close();
    }
}
