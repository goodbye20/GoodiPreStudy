package sec02;

public class IntegerLiteralEx3 {
	public static void main(String[] args) {
		
		char c1 = 'A'; //char 는 그 각각 한글자가 유니코드라는 숫자로
		char c2 = 65;  //구성 되어있기에 정수타입 변수에 포함됨
		char c3 = '\u0041';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		
		System.out.println(c4);
		System.out.println(c5);
	}
}
