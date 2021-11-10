package testcases;

public class ReverseString {
	
	//Killer Rajan
	public static void main(String[] args) {
		String input = "kanagaraj";
		String reverse ="";
		int length = input.length();
		//System.out.println(length);
		
		  for (int i =input.length()-1; i>=0; i--) //8
		  {
			  reverse = reverse+input.charAt(i);
			  
		  }
		  System.out.println(reverse); 
		

	}
	}


