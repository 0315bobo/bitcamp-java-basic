package Day0121;

import java.util.Scanner;
public class StarPrinter10 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("*******별 찍기 10번 *********");
        System.out.print("출력할 줄 수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String stars = new String();

            for (int j = 1; j <= num - i; j++) {
                stars += "*";
            }
            for (int j = 1; j <= i; j++) {

                stars += " ";
            }
            for (int j = 1; j < i; j++) {

                stars += " ";
            }
            
            for (int j = 1; j < num - i; j++) {
                
                stars += "*";
            }
            if(i!=0) {
                stars +="*";
            }

            System.out.println(stars);

        }
        
        for(int i=num-1; i>=1; i--) {
            String stars = new String();
            
            for(int j=0; j<=num-i; j++) {
                stars +="*";
            }
            for(int j=i; j>1; j--) {
      
                stars +=" ";
            }
            for(int j=i-1; j>1; j--) {
      
                stars +=" ";
            }
            for(int j=1; j<=num-i; j++) {
                stars +="*";
            }
            if(i!=1) {
                stars +="*";
            }
            
            System.out.println(stars);
        
        }
        sc.close();
    }

}