package Day0119;
// 자바의 콘솔화면에 출력하는 3가지 방법

// 1. print()
//    print()는 관호안의 내용을 출력하고 그 다음 출력할 것이 있으면
//    print()가 출력한 내용 바로 다음 칸부터 출력을 시작한다.

// 2. println()
//    println() 은 print a line의 줄임말로서
//    println()은 괄호안의 내용을 출력하고 그 다음 출력할 것이 있으면
//    그 다음줄 첫번째 칸부터 출력을 시작한다.

// 3. printf()
//    printf() 는 print in format의 줄임말로서
//    괄호안의 내용을 형식에 맞추어 출력하고 그 다음 출력할 것이 있으면
//    printf()가 출력한 내용 바로 다음 칸부터 출력을 시작한다.

// 4. 공백문자
//    공백문자란, \+알파벳으로 이루어진 "한개"의 문자이다.
//    엔터키, 탭공백 등의 공백문자가 있으며
//    엔터키는 \n, 탭공백은 \t 등으로 표시한다.

public class Ex11Print {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("DEF");

        // 1. print() 를 체험해보자
        System.out.print(str1);
        System.out.print(str2); // ->위에거가 print()니까
                                // 바로 옆에 붙어서 밑에거가 출력됨. 한줄 출력.

        // 2. println() 을 체험해보자
        System.out.println(str1); // -> 위의 print(str2) 때문에 걔 바로 옆에 붙어서 한줄 출력.
        System.out.println(str2); // -> println(str1)이 출력 끝나고 커서를 다음줄로 옮겨놓음.
                                  // 그래서 println(str2)는 다음줄로 출력됨.

        // 3. printf() 를 체험해보자
        System.out.printf(str1, "");
       
        System.out.printf(str2);
        // -> print()랑 무슨 차이인가??? 출력 결과 똑같긴 한데
        // printf()가 더 많이 쓰이는 경우가 있다고 함. 그건 다음 클래스(Ex12)에서 설명..

        // 4. 공백문자 를 체험해보자
        System.out.println();
        // char c = 'ab'; -> 에러. 한글자만 가능한데 두글자니께.
        System.out.print(str1 + '\n');
        // \n이 따옴표 한개짜리 ''인 이유? \n는 엔터키라는 하나의 문자를 뜻하기 때문.
        System.out.print(str1 + "\t" + str2);
        // \t(커다란 공백 하나)도 하나의 문자이기 때문에 ''를 쓴다.

        // 엔터키와 탭공백 ''나 ""이나 둘다 사용 가능함. 어느걸 쓰든 상관 ㄴㄴ
    }
}
