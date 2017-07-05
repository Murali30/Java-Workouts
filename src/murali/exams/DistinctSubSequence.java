package murali.exams;

public class DistinctSubSequence {

	public int helper(char[] a, char[] b, int i, int j) {
		//If the subsequence length reaches the end
		if (j == b.length) {
			if (i == a.length && a[i-1] != b[j-1]) return 0;
			else return 1;
		}
		//If the input sequence reaches before matching with any subsequence
		if (i == a.length) return 0;

		//Check if the characters are same.
		if (a[i] == b[j]) 
			return helper(a, b, i+1, j+1) + helper(a, b, i+1, j);
		else 
			return helper(a, b, i+1, j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bag,bag";
		String inputs[] = s.split(",");
		int ans = new DistinctSubSequence().helper(inputs[0].toCharArray(), inputs[1].toCharArray(), 0, 0);
		System.out.println(ans);
	}

}
