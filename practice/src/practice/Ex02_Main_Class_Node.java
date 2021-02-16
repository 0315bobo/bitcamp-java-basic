package practice;

public class Ex02_Main_Class_Node {
	public static void main(String[] args) {
		
		Ex02__Node one = new Ex02__Node(10, 20);
		Ex02__Node two = new Ex02__Node(30, 40);
		Ex02__Node result = one.getCenter(two);
		System.out.println("X: " + result.getX() + ", Y: " + result.getY());
		
	}
	

}
