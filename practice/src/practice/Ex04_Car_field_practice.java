package practice;
//필드선언

public class Ex04_Car_field_practice {
	//필드 >> (자료형)타입 필드명;
	String name;
	int number;
	
	public static void main(String[] args) {
		
		//객체 선언
		Ex04_Car_field_practice c1 = new Ex04_Car_field_practice(); 
		Ex04_Car_field_practice c2 = new Ex04_Car_field_practice(); 
		
		
		//참조변수.
		//참조변수 뒤에 .를 붙이면 
		//참조변수가 참조하는 객체가 가진것을 사용할 수 있다.
		
		
		c1.name ="포르쉐";
		c1.number = 1234;
		
		c2.name = "람보르기니";
		c2.number = 1111;
		
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		
		//Ex04_Car_field_practice라는 인스턴스가 메모리에 두개 만들어진다.
		//객체 별로 name과 number라는 필드를 가진다.
		
		
		
		//클래스에 객체를 각각 생성할 수 있고
		//각 개체마다 속성을 넣을 수 있다.
		
		
		
		
		
		

	}

}
