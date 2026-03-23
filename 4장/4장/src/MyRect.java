
public class MyRect {
	
	int x1=0; int y1=0;
	int x2=0; int y2=0;
	void buildRect(int a, int b, int c, int d) {
		x1=a;y1=b;
		x2=c;y2=d;
		System.out.println("사각형 면적:"+(x2-x1)*(y2-y1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
