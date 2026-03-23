import java.io.*;
public class SwitchOper {

	public static void main(String[] args) throws IOException {
		int jumsu;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("당신의 점수를 입력하세요!: ");
		jumsu = Integer.parseInt(inbr.readLine()); //여기 왜 오류나지 ㅅㅂ
		int h = jumsu/10;
		switch(h) {
		case 10:
		case 9:
			System.out.print("당신의 학점은 A입니다.");
		case 8:
			System.out.print("당신의 학점은 B입니다.");
		case 7:
			System.out.print("당신의 학점은 C입니다.");
		case 6:
			System.out.print("당신의 학점은 D입니다.");
		default:
			System.out.print("당신의 학점은 F입니다.");	
		}
		// TODO Auto-generated method stub

	}

}
