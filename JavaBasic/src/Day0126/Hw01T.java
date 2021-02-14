package Day0126;
//숙제
//가위바위보 게임을 만드세요
//가위: int 1
//바위: int 2
//보: int 3

//예시:
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 5
//잘못입력하셨습니다.
//가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
//> 2
//사용자: 바위
//컴퓨터: 가위
//사용자 승!!!
//현재 전적: 1승 3무 2패
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 2
//현재 전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트 입니다.
//1. 플레이 2. 현재 전적 보기 3. 종료
//> 3
//사용해주셔서 감사합니다.
import java.util.Random;
import java.util.Scanner;
public class Hw01T {
    static final int INT_SCISSOR = 1;
    static final int INT_ROCK = 2;
    static final int INT_PAPER = 3;
    static final int INT_WIN = 1; //101;
    static final int INT_DRAW = 2; //102;
    static final int INT_LOSE = 3; //103; -> 이렇게 자릿수 띄워놓기도 하는데 여기서는 안할겨.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //-> 스캐너는 외부에서 가져오는 거라서 System.in이 붙는다.
        Random random = new Random(); // 메소드는 모두 ()가 붙는다. 랜덤은 생성자 메소드.
        
        int userWin = 0;
        int userDraw = 0;
        int userLose = 0;
        
        while(true) {
            System.out.println("1. 플레이 2. 현재 전적 보기 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
                // 플레이 하는 코드 구현
                System.out.print("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3): "); 
                int userSelect = scanner.nextInt();
                while(userSelect < INT_SCISSOR || userSelect > INT_PAPER) {
                    System.out.println("잘못입력하셨습니다.");
                    System.out.print("가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3): ");
                    userSelect = scanner.nextInt();
                }
                
                int computerSelect = random.nextInt(INT_PAPER) + 1;
                
                int result = 0;
                if(userSelect == computerSelect) {
                    result = INT_DRAW;
                }else {
                    if((userSelect == INT_ROCK && computerSelect == INT_PAPER) ||
                            (userSelect == INT_SCISSOR && computerSelect == INT_ROCK) ||
                            (userSelect == INT_PAPER && computerSelect == INT_SCISSOR)) { 
                        result = INT_LOSE;
                    }else {
                        result = INT_WIN;
                    }
                }
                
                String userSelectWord = new String();
                String computerSelectWord = new String();
                
                
                if(userSelect == INT_ROCK) {
                    userSelectWord = "바위";
                }else if(userSelect == INT_PAPER) {
                    userSelectWord = "보";
                }else {
                    userSelectWord = "가위";
                }
                
                if(computerSelect == INT_ROCK) {
                    computerSelectWord = "바위";
                }else if(computerSelect == INT_PAPER) {
                    computerSelectWord = "보";
                }else {
                    computerSelectWord = "가위";
                }
                System.out.println("사용자: "+userSelectWord);
                System.out.println("컴퓨터: "+computerSelectWord);
                
                if(result == INT_WIN) {
                    System.out.println("사용자 승!!!");
                    userWin++;
                }else if(result == INT_DRAW) {
                    System.out.println("사용자 무!!!");
                    userDraw++;
                }else if(result == INT_LOSE) {
                    System.out.println("사용자 패!!!");
                    userLose++;
                }
                
            }else if(userChoice == 2) {
                // 전적 보여주는 코드 구현
                int sum = userWin + userDraw + userLose;
                if(sum == 0) {
                    System.out.println("아직 플레이 기록이 없습니다.");
                }else {
                    double winRate = (double)userWin / sum*100;
                    System.out.printf("현재 전적은 %d승 %d무 %d패입니다. 승률은 %.4f퍼센트 입니다.\n", 
                            userWin, userDraw, userLose, winRate);
                }
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        
        scanner.close();
    }
}



