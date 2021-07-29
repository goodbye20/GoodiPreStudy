package sec4.exam04;

public class QstopExample {
public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCord: " + keyCode);
		if(keyCode == 113) {
			break;
		}
		}
		
		System.out.println("종료");
	}
}

//System.in.read(); 의 단점 - 2개이상의 키가 조합된 한글을 읽을수 없음