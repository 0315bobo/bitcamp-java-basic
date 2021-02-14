package Day0121;

import java.util.Scanner;

// 별찍기 9번
public class StarPrinter09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****별찍기 9번*****");
        System.out.print("출력할 줄 수를 입력하세요: ");
        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++) {

            String stars = new String();

            for (int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        for (int i = userNumber - 1; i >= 1; i--) {

            String stars = new String();

            for (int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        scanner.close();
    }
}