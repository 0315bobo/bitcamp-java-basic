package practice;

/*

코드 설명)

동전케이스를 스택 클래스로 구현한다.
동전케이스는 위에만 오픈되어있는 스택 구조를 가지고있다.
먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 
위에 쌓이기 때문에 스택에서 동전을 빼면
마지막에 넣은 동전이 먼저 나온다.

​
*/

public class Ex01__Coin {
	
	private int value;
	
	public Ex01__Coin(int v) {
		this.value = v;
	}
	public int getValue() {
		return value;
	}

}
