package Day0120;
// 중첩 if문(Nested if)
// 한개의 if block 안에
// 새로운 if block이 들어가는 것을
// 중첩 if문이라고 한다.
public class Ex09NestedIf {
    public static void main(String[] args) {
        int number = 5;
        if(number >= 0) {
            System.out.println("자연수입니다.");
            double d = 3.14;
            if (d == 3.14) {
                System.out.println("d는 원주율입니다.");
                
            }
        }
    }
}
