package murali.exams;

public class Changepi {

	public String changePi(String str) {
		int length = str.length();
		  if(length>1)
		  {
			  System.out.println(str);
			  if(str.substring(0, 1).equalsIgnoreCase("p"))
				  if(str.substring(1, 2).equalsIgnoreCase("i"))
					  return "3.14"+ changePi(str.substring(2, length));
				  else
					  return str.substring(0, 1) + changePi(str.substring(1, length));
			  else
				  return str.substring(0, 1)+changePi(str.substring(1, length));
		  }
		  else
		  {
			  return str;
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Copix";
		System.out.println(new Changepi().changePi(str));
	}

}
