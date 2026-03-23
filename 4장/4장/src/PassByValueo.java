
public class PassByValueo {
	
	public void increment (int j) {
		j++;
		System.out.println("Value of j in the increment = "+ j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=5;
		PassByValueo pbv = new PassByValueo();
		System.out.println("Value of j before the call= "+j);
		pbv.increment(j);
		System.out.println("Value of j after the call= "+j);
	}

}
