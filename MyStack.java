package kr.or.bit;

//Stack 자료구조를 설계
//저장 공간 : Array : Object[] sarray
//MyStack my = new MyStack(10); // 기본적으로 배열 생성 //크기 설정 가능 ()안에 숫자로.
//위치정보 :저장되는 값이 있는 위치정보(position, index)
//기능 : push(Object), Object pop 끄집어내는거 , isEmpty배열이 비어있는지 확인 가능 , Full 꽉 차 있니



//*******수요일 시험(종이 시험)**************

public class MyStack {
	
	private Object[] stackarr; //저장공간 ->정적배열..    //stackarr는 자료형이 Object인 배열
	private int maxsize; //최대크기 정보 저장 변수
	private int top; // 배열의 index (위치정보)
	
	public MyStack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1); //true , false 너 비었니
	}
	public boolean isFull() {
		return (top == maxsize-1); //배열은 마지막방 숫자가 전체 length -1 이니까
	}

    public void push(Object i) {
    	if(isFull()) {
    		System.out.println("stack full......");
    	}else {
    	stackarr[++top] =i; // -1 >> 0
    	}
    }
    
    public Object pop() {
    	Object value = null;
    	
    	if(isEmpty()) {
    		System.out.println("stack empty");
    	}else {
    		value = stackarr[top];
    		top--;
    	}
    	
    	return value;
    }


	public static void main(String[] args) {
		
		
		
		
		
	}
	
	
	

	
}
