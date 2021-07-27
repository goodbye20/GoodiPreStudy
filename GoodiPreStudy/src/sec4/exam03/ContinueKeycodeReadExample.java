package sec4.exam03;

public class ContinueKeycodeReadExample {
	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCord: " + keyCode);
			 
		}
		
	}
}
