//3장 연습문제 1번
import java.util.*;
public class EEx3_11 {

	public static void main(String[] args) {
		int intval;
		int count =0;
		int total = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요!: ");
		intval = scan.nextInt();
		
		for(int i=0; i<= intval;i=i+5) {
			total += i;
			count++; //개수 세는 거
		}
		
		System.out.println("정수 입력 값: "+intval);
		System.out.println("5의 배수의 개수: "+(count-1));
		System.out.println("5의 배수의 합: "+total);
		// TODO Auto-generated method stub

	}

}
