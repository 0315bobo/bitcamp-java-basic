package Day0122;
//별찍기 10번
import java.util.Scanner;
public class StarPrinter10Hw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("******별찍기 10번******");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scan.nextInt();
        
        for (int i = 1; i <= userNumber ; i++ ) {
            
           String stars = new String();
           for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
            
        }
        
        
        scan.close();
    }    
}
