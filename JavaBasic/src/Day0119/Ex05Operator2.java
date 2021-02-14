package Day0119;
// 할당연산자
// 할당연산자는 오른쪽 값을 연산해서
// 왼쪽 공간에 넣는 역할을 맡는다.

// =, +=, -=, *=, /=, %=, ++, --
public class Ex05Operator2 {
    public static void main(String[] args) {
        int number;
        
        
        // 1. = 은 오른쪽 값을 왼쪽 공간에 할당한다.
        number = 5;
        System.out.println("1. number = 5 결과값: "+number);
     // number 값은 5
        
       // 2. += 은 왼쪽 공간의 현재 값에 오른쪽 값을 더한 결과값을
        //    왼쪽 공간에 다시 할당한다.
        //    +=은 String에도 사용가능하다.
        number += 4;
        System.out.println("2. number += 4 결과값: "+number);
     // number 값은 9
        
        String str = new String("123");
        str += 45; //-> 이때 45는 int 45지만 srt이 문자이므로 뒤로 이어 붙여지는 것.
        System.out.println("2. str += 45 결과값: "+str);
    
        
        
        
        // 3. -= 은 왼쪽 공간의 현재 값에 오른쪽 값을 뺀 결과값을
        //    왼쪽 공간에 다시 할당한다.
        number -= 2;
        System.out.println("3. number -= 2 결과값: "+number);
     // number 값은 7
        
        
        
        // 4. *= 은 왼쪽 공간의 현재 값에 오른쪽 값을 곱한 결과값을
        //    왼쪽 공간에 다시 할당한다.
        number *= 4;
        System.out.println("4. number *= 4 결과값: "+number);
     // number 값은 28
        
        
        
        
        // 5. /= 은 왼쪽 공간의 현재 값에 오른쪽 값을 나눈 몫을
        //    왼쪽 공간에 다시 할당한다.
        number /= 3;
        System.out.println("5. number /= 3 결과값: "+number);
     // number 값은 9
        
        
        
        
        // 6. %= 은 왼쪽 공간의 현재 값에 오른쪽 값을 나눈 나머지를
        //    왼쪽 공간에 다시 할당한다.
        number %= 7;
        System.out.println("6. number %= 7 결과값: "+number);
     // number 값은 2
        
        
        // ++ 와 -- 은 해당 공간의 값을 1씩 변화시키는데
        // 변수의 앞에 붙냐 뒤에 붙냐에 따라서 실행시점이 달라지게 된다.
        System.out.println(++number);
        
        // (++number) 실행 먼저 하고 
        // System.out.println(number); 실행 된다.
        // 총 2번 실행됨.
        // ++number는 1 증가를 먼저 한 후에 number가 출력됩니다.
        // 그러므로 3이 출력되게 됩니다.
        
        
        
        // ++ 혹은 -- 가 변수의 앞에 붙어있을 경우,
        // 해당 줄에서 가장 먼저 실행이 된다.
        // 즉 위의 System.out.println(++number) 의 경우
        // 먼저 ++number가 실행되서 number의 현재 값이 1 증가 된다.
        // 그리고 나서 System.out.println()이 실행되면서
        // 1 증가된 number의 현재 값이 화면에 출력이 된다.
        
        System.out.println("number의 현재값: "+number);
      // number 값은 3
        
        // 반대로 ++ 혹은 -- 가 뒤에 붙으면 그 줄에서
        // 가장 마지막에 실행이 된다.
        System.out.println(number++);
        // 1. System.out.println(number); 먼저 실행 시켜지고
        // 2. 그리고나서 number++ 값을 실행시킨다.
        // -> 먼저 number를 출력한 뒤 number를 증가하게 됩니다. 
        //    그러므로 출력은 3으로 나오지만 3로 출력된 후 
        //    1증가하여 number는 4가 됩니다
        
        
        System.out.println("number의 현재값: "+number);
     // number 값은 4
        
    }
}

     // ++number : 먼저 1증가하고 그다음에 출력
     // number++ : 먼저 원래 숫자 출력부터 하고 그다음에 1 증가







