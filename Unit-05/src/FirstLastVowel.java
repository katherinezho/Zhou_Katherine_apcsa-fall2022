//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   if (a.substring(0,1).equals("a") || a.substring(a.length()-1).equals("a")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("e") || a.substring(a.length()-1).equals("e")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("i") || a.substring(a.length()-1).equals("i")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("o") || a.substring(a.length()-1).equals("o")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("u") || a.substring(a.length()-1).equals("u")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("A") || a.substring(a.length()-1).equals("A")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("E") || a.substring(a.length()-1).equals("E")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("I") || a.substring(a.length()-1).equals("I")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("O") || a.substring(a.length()-1).equals("O")){
		   return "yes";
	   }
	   else if (a.substring(0,1).equals("U") || a.substring(a.length()-1).equals("U")){
		   return "yes";
	   }
			   
	   return "no";
	}
}