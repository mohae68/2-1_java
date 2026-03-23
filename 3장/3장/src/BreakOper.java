
public class BreakOper {

	public static void main(String[] args) {
		int x = 0;
		int sum = 0;
		System.out.println("<<무한반복>>");
		
		bklabel:while(true) {
			while(true) {
				if(x>=500) break bklabel;
				x++;
				sum=sum+x;
			}
		}
		// TODO Auto-generated method stub
		System.out.print("1부터 500까지의 합: "+sum);
	}

}
