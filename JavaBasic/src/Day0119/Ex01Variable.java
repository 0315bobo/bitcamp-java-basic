package Day0119;
// 변수 (Variable)
// 변수란 우리가 stack 메모리 영역에 등록하는 하나의 공간으로서
// 우리가 해당 변수를 선언할 때 지정한 데이터타입과 맞는 값이면
// 언제든 그 공간의 내용을 바꿔줄 수 있다.
// 즉 내용이 '변'할 수 있기 때문에 변수이다.

// 변수를 우리가 사용하기 위해서는
// '선언'과 '초기화'의 단계를 거쳐야 사용가능하다.
// 선언: 해당 변수의 데이터타입과 이름을 지정
// 초기화: 변수는 우리가 사용하기 위해서는 무조건 한번은 값을 할당해주어야 한다.

// 변수의 선언방법
// 데이터타입 이름;
// 변수의 초기화방법
// 이름 = 값;

public class Ex01Variable {
    public static void main(String[] args) {
        // int 변수 number를 선언해보자
        int number;
        
        number = 20;
        System.out.println("number의 현재값: "+number);
        
        number = 45;
        System.out.println("number의 현재값: "+number);
        
        // 만약 우리가 지정한 변수의 데이터타입과 다른 값을 넣어주면
        // 에러가 발생한다. -> number = 4.5;
        
        number = 'A';
        System.out.println("number의 현재값: "+number);
        // -> ASCII 테이블로 변환된 숫자가 나온다.
        
        // 실수형 변수를 만들어보자
        double d = 3.131492;
        System.out.println("d의 현재값: "+d);
        
        // 정수형 공간에 실수값을 넣을 수는 없지만
        // 실수형 공간에는 정수값을 넣을 수 있다.
        
        // number = 4.7; -> 0.7은 날아간다. 데이터 손실 발생. 
        // 컴퓨터는 데이터 손실 발생하는거 싫어해.
        
        d = 3;
        // -> 상관없음. 3.0000 과도 같다.
        
        // 문자형 변수를 만들어보자
        char c = 'b'- 32;
        // 'b' - 32 -> ASCII 테이블에서 해당값 - 32를 하면 된다.
        System.out.println("c의 현재값: "+c);
        
        // 논리형 변수를 만들어보자
        boolean b = true;
        System.out.println("b의 현재값: "+b);
        
    }
}









