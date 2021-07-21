package sec1;

public class VariableInitialztionEx4 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2; 
			v2 = v1 - 10;
			
			
		}
//		위 공간에선 v1은 사용할수 있으나
//		if 블록에서 벗어났기에 v2(local변수)는 사용할수 없다
	}
}
