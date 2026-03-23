//대입 연산자, 복합 대입 연산자 실습이여
public class AssigOper {

	public static void main(String[] args) {
		int x, y, z;
		x = y = z = 100;
		
		z += x + y;
		x += y -= z *= 5;
		x += y = z;
		
		System.out.println("x = " + x + ", y = "+y+", z = "+z);
		// TODO Auto-generated method stub

	}

}
