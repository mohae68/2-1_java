//p.74
public class HW_1 {

	public static void main(String[] args) {
		int[][] subject = new int[10][10];
		
		for(int x=1; x<10;x++) {
			for(int y=1; y<10; y++) {
				subject[x][y] = x*y;
			}
		}
		
		for(int x=1;x<10;x++) {
			for(int y=1; y<10; y++) {
				System.out.print(x+"*"+y+"="+subject[x][y]+"\t");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
