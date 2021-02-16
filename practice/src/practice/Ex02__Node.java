package practice;

public class Ex02__Node {
	
	//멤버필드
	private int x;
	private int y;
	
	//외부에서 데이터 사용 및 설정
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	
	//생정자
	public Ex02__Node(int x, int y) {  // 메인함수의 Ex02__Node one = new Ex02__Node(10, 20); 
		this.x = x;                    //    에서 10,20은 여기 생성자로 들어가게 된다.
		this.y = y;
	}
	
	//좌표 가운데로
	public Ex02__Node getCenter (Ex02__Node other){ //다른데서 받아오는 other
		return new Ex02__Node((this.x + other.getX()) / 2 ,(this.y + other.getY()) /2 );
	}
	

}
