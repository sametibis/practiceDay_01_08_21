package practiceOzkanAyata04;

public class Q3 {

	/*
	 * 6.Write a method that reverses a number. Method accepts an integer and
	 * returns an int. EX: 123 --> 321
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(revMeth(321));
		System.out.println(reverseNumber(75));

	}

	static int revMeth(int num) {
		String sNum = String.valueOf(num);
		StringBuilder sb = new StringBuilder(sNum);
		int revNum = Integer.parseInt(sb.reverse().toString());
		return revNum;
	}

	// Another Way
	static int reverseNumber(int num) {
		int revNum = 0;
		for(int i = num; i>0; i/=10) {
			revNum = revNum * 10 + (i%10);
		}
		return revNum;
	}
	
	

}
