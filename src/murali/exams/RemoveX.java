package murali.exams;

public class RemoveX {

	public String noX(String str) {
		int length = str.length();
		  if(length>0)
		  {
			  System.out.println(str);
			  if(str.substring(0, 1).equalsIgnoreCase("x"))
			  return ""+ noX(str.substring(1, length));
			  else
				  return str.substring(0, 1)+noX(str.substring(1, length));
		  }
		  else
		  {
			  return "";
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Codex";
		System.out.println(new RemoveX().noX(str));
	}

}
