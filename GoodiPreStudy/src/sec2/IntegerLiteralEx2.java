package sec2;

public class IntegerLiteralEx2 {

	public static void main(String[] args) {
		
		byte val1 = -128;
		byte val2 = 0;	
		byte val3 = 127; //byte는 -128  ~  127까지
		
		System.out.println("val1: " + val1);
		System.out.println("val2: " + val2);
		System.out.println("val3: " + val3);

		
		long longV1 = 10;
		long longV2 = 20L;
		long longV3 = 20000000000L; 
		//자바 컨파일러는 정수형을 기본적으로 int형으로 간주하기에 L을붙여줌
		System.out.println("longV1: " + longV1);
		System.out.println("longV2: " + longV2);
		System.out.println("longV3: " + longV3);

	}
}
