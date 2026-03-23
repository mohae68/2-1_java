import java.util.*;
public class RandomExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int num = ran.nextInt(100);
		System.out.println("0 부터 99사이의 임의의 값 출력: "+num);
		float flt = ran.nextFloat();
		System.out.println("0.0부터 1.0사이의 임이ㅢ의 값 출력: "+flt);
		boolean bln = ran.nextBoolean();
		System.out.println("임의의 논리값 출력: "+bln);
		System.out.println("*** 복권번호 출력 ***");
		for(int i=0;i<6;i++) {
			num=ran.nextInt(46);
			System.out.println((i+1)+"번째 복권번호: "+num);
		}

	}

}
