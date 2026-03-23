import java.lang.Math;
import java.util.*;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //scanner 객체 생성
		
		double pai = 3.14159;
		double circle;
		int r;
		
		System.out.print("원의 반지름을 정수로 입력하시오 : ");
		r = scanner.nextInt();
		System.out.println("원의 반지름: "+ r);
		circle = 2 * r * pai;
		System.out.println("원의 둘레: "+ circle);

	}

}
