package murali.exams;

public class Countx {

	public int countX(String str) {
		  int n = str.length();
		  if(n>0)
		  {
			  //System.out.println(str.substring(n-1,n));
		    if(str.substring(n-1,n).equalsIgnoreCase("x")){
		    	return 1+countX(str.substring(0,n-1));
		    }
		    
		    else
		    return countX(str.substring(0,n-1));
		  }
		  else
		  {
		    return 0;
		  }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "xxhixx";
		System.out.println(new Countx().countX(abc));
	}
}
