package conbination;

public class Conbination_lib {
  
	public int getFactorial(int n) {
		int f = 1;
		for(int i = 1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
}
