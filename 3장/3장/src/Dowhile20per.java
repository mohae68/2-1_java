import java.io.*;
public class Dowhile20per {

	public static void main(String[] args) throws IOException{
		int innum; int outnum;
		int count; int sum=0;
		BufferedReader inbr = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.print("합을 구하는 시작숫자 입력: ");
		innum = Integer.parseInt(inbr.readLine());
		System.out.print("합을 구하는 끝 숫자 입력: ");
		outnum = Integer.parseInt(inbr.readLine());
		
		count = innum; //마지막 print 할 때 숫자 나타내주기 위해서 count에 옯긴것임
		sum = count;
		
		do {
			count++;
			sum+=count;
		} while(count<outnum);
		System.out.print(innum+"부터"+outnum+"까지의 합: "+sum);
		// TODO Auto-generated method stub

	}

}
