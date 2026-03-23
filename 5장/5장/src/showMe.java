public class showMe {
	int x=0;
	int y=1;
	void showMe() {
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
	} }

class ShowSub2 extends showMe{
	int z=3;
	
	void showMe() {
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		System.out.println("Z is "+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowSub2 obj = new ShowSub2();
		obj.showMe();
	}
}


