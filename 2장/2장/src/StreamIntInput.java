import java.util.*;
public class StreamIntInput {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요!: ");
		number = scanner.nextInt();
		
		System.out.println("입력한 년도는 " + number + "년 입니다.");

	}

}
