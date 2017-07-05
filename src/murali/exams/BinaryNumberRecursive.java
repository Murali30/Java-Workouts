package murali.exams;

public class BinaryNumberRecursive {

	public int bin(int n)
	{
		if(n>0)
		{
			if(n%2 == 1)
				return 1+ bin(n/2);
			else
				return bin(n/2);
		}
		else
		{
				return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BinaryNumberRecursive().bin(0)); 
	}

}
