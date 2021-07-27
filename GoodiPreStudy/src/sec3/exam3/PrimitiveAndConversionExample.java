package sec3.exam3;

public class PrimitiveAndConversionExample {
	public static void main(String[] args) {
		
		String str1 = "10";
		int value1 = Integer.parseInt(str1);
		System.out.println(value1);
		
		double value2 = Double.parseDouble("3.14");
		System.out.println(value2);
		
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println(value3);
	
		
		
		int value4 = 10;
		String str2 = String.valueOf(value4);
		System.out.println("str2: " + str2);
		
		String str3 = String.valueOf(3.14);
		System.out.println("str3: " + str3);
		
		String str4 = String.valueOf(true);
		System.out.println("str4" + str4);
		
		
		
		
		
	}
}
