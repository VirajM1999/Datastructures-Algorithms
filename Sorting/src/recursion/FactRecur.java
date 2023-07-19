package recursion;

public class FactRecur {

	public static void main(String[] args) {
		
		
		int fact=calFact(5);
		System.out.println(fact);

	}

	private static int calFact(int i) {
		if(i==1) {
		return i;
		}
		
		
		int fact=calFact(i-1)*i;
		
		return fact;
	}

}
