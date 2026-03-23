import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileOper {

	public static void main(String[] args) throws IOException {
		int number;
		int x = 1;
		int y = 1;
		BufferedReader inbr = new BufferedReader(new
							InputStreamReader(System.in));
		System.out.print("그릴 삼각형 높이를 입력하세요!:");
		number = Integer.parseInt(inbr.readLine());
		
		while(x <= number) {
			while(y <= x) {
				System.out.print("x");
				y = y +1;
			}
			System.out.println();
			x = x +1;
			y = 1;
		}
		// TODO Auto-generated method stub

	}

}
