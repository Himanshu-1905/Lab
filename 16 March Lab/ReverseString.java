
//Write a java program to reverse every word in string.
public class ReverseString{
	public static void main(String[] args) {
		 String s1 = "Welcome to java";
		 System.out.println("String: "+s1);  //printing original string
	     String word[]=s1.split(" ");
	     String revString=" "; 
	     for(String w:word) {
	    	 StringBuilder sb=new StringBuilder(w);
	    	 sb.reverse();
	    	 revString=revString+sb.toString()+" ";
	     }
	     //Reverse output print
	     System.out.println("Reverse every word is :"+revString.trim());
	     }
	}

