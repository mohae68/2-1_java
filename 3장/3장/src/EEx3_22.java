//3장 연습문제 2번
import java.util.*;
public class EEx3_22 {

	public static void main(String[] args) {
		int a; int b; 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요!: ");
		a = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요!:");
		b = scan.nextInt();
		
		if(a>b)
			System.out.println("큰 값은 "+a+" 작은 값은 "+b);
		
		else if(a == b)
			System.out.println("두 정수의 값은 같습니다.");
		
		else
			System.out.println("큰 값은 "+b+" 작은 값은 "+a);
		
		// TODO Auto-generated method stub

	}

}
