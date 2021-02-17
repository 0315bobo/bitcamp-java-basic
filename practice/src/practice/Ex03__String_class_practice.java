package practice;

public class Ex03__String_class_practice {

	public static void main(String[] args) {
		
		//변수에는 인스턴스의 주소값이 들어있다.
		
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		//new 없이 인스턴스를 만들면 메모리에서 상수 영역에 객체 저장됨.
		//첫번째 줄 코드에서 이미 상수로 선언되었으므로
		//str2는 str1과 같은 인스턴스를 참조하게 된다.
		
		if(str1 == str2) {
			System.out.println("str1은 str2와 같은 인스턴스를 참조한다.");
		}else {
			System.out.println("str1은 str2와 다른 인스턴스를 참조한다.");
		}
		
		
		String str3 = new String("Hello World");
		String str4 = new String("Hello World");
		
		//new 키워드를 사용하면 무조건 메모리에 객체가 새로 올라간다. 
		//new키워드로 만든 인스턴스는 상수영역을 참조하지 않는다. 무조건 heap에 올린다. 
		
		if (str3 == str4) {
			System.out.println("str3과 str4의 객체 주솟값은 같다.");
		}else {
			System.out.println("str3과 str4의 객체 주솟값은 다르다.");
		}
        //두 String 객체는 똑같이 생겼지만
		//그 객체의 저장위치는 다르므로 ==연산자로 비교할 때
		//다르다고 나오는 것.

//---------------------------------------------------------------------------------
		//String 값이 같은지 알고 싶다면????
		
		//==연산자로 String을 비교하면 
		//레퍼런스를 비교하는 것이기 때문에 같은 값인지 확인할 수 없다.
		//이때, 같은 값인지 확인하고 싶다면
		//equals메서드 를 사용하면 된다.
		
		String str5 = new String("Hello World");
		String str6 = new String("Hello World");
		
		if (str5.equals(str6)) {
			System.out.println("str5와 str6는 같은 값을 가진다.");
		}else {
			System.out.println("str5와 str6는 다른 값을 가진다.");
		}
		   
	
		//equals메서드는 메서드에서 구현한 내용을 판단한다.
		//객체 주소 (X)
		//객체 내용 (0) 비교  
		
		
		//그래서 str5와 str6가 같다는 결고가 나온것.
		
	}

}












