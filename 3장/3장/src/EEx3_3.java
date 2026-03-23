//3장 연습문제 3번 (BufferedReader사용)
import java.io.*;
public class EEx3_3 {
	public static void main(String[] args) throws IOException{
		int a; int b;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("첫 번째 정수를 입력하세요!: ");
			a = Integer.parseInt(inbr.readLine());
			System.out.print("두 번째 정수를 입력하세요!: ");
			b = Integer.parseInt(inbr. readLine());
			
			
			
			if(a*b>500) {
				
				System.out.println("두수의 곱이 500을 초과하였습니다.");
				break;
			}
			else 
				System.out.println("a * b = "+ a*b);
			
		}
	}

}
