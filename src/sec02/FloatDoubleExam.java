package sec02;

public class FloatDoubleExam {
	public static void main(String[] args) {
		
//		float var1 = 3.14;
		double var2 = 3.14;
		float var3 = 3.14f;
		
		System.out.println(var2);
		System.out.println(var3);
		
		float var4 = 0.123456789f;
		double var5 = 0.123456789;
		
		System.out.println(var4); //float 은 7자리까지
		System.out.println(var5);
		
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
