class Phone{
	void callUp() {
		System.out.println("calling someone.");
	}
	void answer() {
		System.out.println("answer a phone.");
	}
}

interface Cameralike{
	void takePhone();
	void viewPhoto();
}

public class MobilePhone extends Phone implements Cameralike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
