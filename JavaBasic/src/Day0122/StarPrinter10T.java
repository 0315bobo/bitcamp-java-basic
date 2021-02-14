package Day0122;
//커다란 for문사용해서 만들어보기

import java.util.Scanner;
public class StarPrinter10T {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("******별찍기 10번******");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int num = scan.nextInt();
        
        for(int i = 1; i <= 2*num - 1; i++) {
            String stars = new String();
            
            //너비 인치 값에 대한 변수
            int totalWidth = 2*num - 1;
            
            if( i == 1 || i == 2*num - 1) {
            //맨 첫줄과 맨 마지막줄 인 경우
            // 별을 2*num - 1개 만큼 넣어준다.
                for(int j = 1; j <= totalWidth; j ++) {
                    stars += "*";
                }
                
            }else if( i <= num -1) {
                // 첫번째 줄을 제외한 윗부분
                int upperI = i - 1;
                
                //해당 줄의 왼쪽 혹은 오른쪽의 별의 갯수
                int starWidth = num - upperI;
                
                //왼쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                
                //해당 줄의 공백의 갯수
                //= 총 너비 - 별의 갯수
                int spaceWidth = totalWidth - 2 * starWidth;
                
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                
                //오른쪽 별 부분
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
            }else {
                // 맨 마지막 줄을 제외한 아랫부분
                // i 가 5 6 7 8 일 경우 여기 엘스로 들어온다.
                
                int lowI = i - num + 1;
                
                //해당 줄의 별의 갯수
                int starWidth = lowI;
                
                //왼쪽 별을 담당하는 j for 문 
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
                
                //해당 줄의 공백의 갯수
                int spaceWidth = totalWidth - 2*starWidth;
                
                //가운데 공백을 담당하는 j for 문
                for (int j = 1; j <= spaceWidth; j++) {
                    stars +=" ";
                }
                
                //오른쪽 별을 담당하는 j for 문
                for(int j = 1; j <= starWidth; j++) {
                    stars += "*";
                }
                
            }
            
            
            
            
            System.out.println(stars);
            
        }
        
        
        
        
        
        
        scan.close();
    }

}
