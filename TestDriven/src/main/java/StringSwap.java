
public class StringSwap {
	

  public String swap2chars(String str)
  {
  
	  char first = str.charAt(0);
	  char second = str.charAt(1);
	  return "" + second + first ;
	  
  }
  
  public String swaplast2chars(String str)
  {
	  int length = str.length();
	  
	  String strlast2chars = str.substring(0, length-2);
	  
	  char secondlast = str.charAt(length-2);
	  char last = str.charAt(length-1);
	  
	  return strlast2chars + last + secondlast;
	  
  }
  
   
}
