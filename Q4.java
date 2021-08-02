package practiceOzkanAyata04;

public class Q4 {
	/*
	 * 7.Write a method that gets any number from a string it gets and returns the
	 * total of those number.EX :extractNum("aa2aa3") ==> 2+3 ==> 5.
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(extractNum("aa2a5a3"));
		System.out.println(extractNum2("aa2a5a3"));
	}
	
	static int extractNum(String str) {
		int total = 0;	
		for(int i = 0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				total += Integer.parseInt(str.charAt(i)+"");
			}
		}
		return total;
	}
	
	
	// Another way
	static int extractNum2(String str) {
		int value = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		int sum = 0;
		while(value!=0) {
			sum += value % 10;
			value /= 10;
		}
		return sum;
	}

}
