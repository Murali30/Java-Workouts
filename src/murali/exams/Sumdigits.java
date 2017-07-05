package murali.exams;

public class Sumdigits {

	public int sumDigits(int n) {
		if(n>0)
		{
			return n%10+sumDigits(n/10);
		}
		else
		{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 126;
		Sumdigits sd = new Sumdigits();
		System.out.println(sd.sumDigits(n));
	}

}
