package murali.exams;

public class ChangeChars {

	public String changeXY(String str) {
		  int length = str.length();
		  if(length>1)
		  {
			  System.out.println(str);
			  if(str.substring(0, 1).equalsIgnoreCase("x"))
			  return "y"+ changeXY(str.substring(1, length));
			  else
				  return str.substring(0, 1)+changeXY(str.substring(1, length));
		  }
		  else
		  {
			  if(str.equalsIgnoreCase("x"))
				  return "y";
			  else
				  return str;
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Codex";
		System.out.println(new ChangeChars().changeXY(str));
	}

}
