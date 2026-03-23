//p.44
public class Array2Prog {

	public static void main(String[] args) {
		int[][] arycount = {{10, 20, 30}, {40, 50, 60}};
		int[][] subject = new int[2][3];
		int asum =0; int bsum=0;
		
		for(int i=0;i<subject.length;i++) {
			for(int j=0;j<subject[i].length;j++) {
				subject[i][j] = i+j;
			}
		}
		
		for(int x=0;x<arycount.length;x++) {
			for(int y=0; y<arycount[x].length;y++) {
				asum = asum + arycount[x][y];
				bsum += subject[x][y];
			}
		}
		
		System.out.println("2차원배열 arycount의 행수: "+arycount.length);
		System.out.println("2차원배열 arycount의 열수: "+arycount[0].length);
		System.out.println("2차원배열 arycount의 합: "+asum);
		System.out.println("2차원배열 subject의 합:"+bsum);
		// TODO Auto-generated method stub

	}

}
