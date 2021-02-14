package Day0119;
// 연산자(operator)
// 연산자란 특정 수학 기호에 프로그래밍 기능을 정의해놓은 것이다.

// 연산자에는 크게

// 산술 
// 할당 
// 비교 
// 논리 
// 비트 (->자바에서 잘 안쓰이고 난이도가 매우 어렵다.)(이수업에서는 안배우겠다.)

// 5가지 연산자의 종류가 있다.

// 산술 연산자
// 산술 연산자는 2개의 값에 대한 산술(간단한 산수)를 실행한다.

// +: 2개의 값을 더한다.
// -: 앞의 값에서 뒤의 값을 뺀다.
// *: 2개의 값을 곱한다.
// /: 앞의 값에서 뒤의 값을 나눈 몫을 구한다.
// %: 앞의 값에서 뒤의 값을 나눈 나머지를 구한다.

// 산술연산자의 경우 서로 다른 데이터타입을 연산시키면
// 더 큰 데이터타입이 결과값이 된다.
// 만약, byte와 int를 연산시키면 결과값은 int가 된다.
// 만약, 실수형 데이터타입과 정수형 데이터타입을 연산시키면 결과값은 실수형 데이터타입이
// 된다.

public class Ex04Operator {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 7;
        
        System.out.println("number1 + number2: ");
        System.out.println(number1 + number2);
        
        System.out.println("number1 - number2: ");
        System.out.println(number1 - number2);
        
        System.out.println("number1 * number2: ");
        System.out.println(number1 * number2);
        
        System.out.println("number1 / number2: ");
        System.out.println(number1 / number2);
        // 정수형 데이터타입끼리의 나눗셈은 무조건 몫만 구한다.
        
        System.out.println("number1 % number2: ");
        System.out.println(number1 % number2);
        // 두 수의 나눗셈의 나머지를 구한다.
        
        System.out.println("==================================");
        
        double d = 7.0;
        
        System.out.println("number1 + d: ");
        System.out.println(number1 + d);
        
        System.out.println("number1 - d: ");
        System.out.println(number1 - d);
        
        System.out.println("number1 * d: ");
        System.out.println(number1 * d);
        
        System.out.println("number1 / d: ");
        System.out.println(number1 / d);
        
        System.out.println("number1 % d: ");
        System.out.println(number1 % d);
        
        // String 이란?
        // String은 클래스로서
        // 여러개의 문자를 할당 가능한 데이터타입이다.
        // String 값은 "" 안에 적힌 글자들이 값이 된다.
        // 우리가 코드상으로 만들어놓은 "" 안의 값은
        // 힙 메모리 영역안에 스트링 풀 이라는 곳에 정의가 된다.
        
        // String 변수를 선언해보자
        String string;
        string = new String("abc");
        // String string = new String("abc"); 가 저 두줄을 합친 한줄인겨.
        
        String string2 = "abc";
        // -> 왼쪽 string2 는 stack에서 변수로 주소값 생김.
        //    이때 변수니까 주소값 변경도 가능하며 heap에는 없는 주소가 된다. 즉 변수 주소값 따라가도 값 음슴.
        //    즉 heap에서 주소를 참조해서 따라가면 string 값을 볼 수 는겨.
        //    -> 모든 클래스 변수는 이런 구조를 가지게 된다.
        
        // String 의 경우, 더하기 연산이 가능하다.
        // String에 더하기 연산을 하면
        // 앞의 내용과 뒤의 내용을 모두 String으로 만들고
        // 두 내용을 이어 붙여라 라는 뜻이 된다.
        
        // 예를 들어서
        // string + "DEF" 를 하게 되면?
        // string의 현재 해당 주소값에 저장된 "abc" 라는 글자와
        // "DEF"를 연결해서
        // "abcDEF" 라는 String을 만들라는 의미가 된다.
        
        // "number의 현재값: " + number의 경우
        // number 변수 안에 저장된 값을 String, 즉 글자로 바꾸고
        // "number의 현재값: " 뒤에 이어붙이라는 이야기가 된다.
        
        
        
    }

}
