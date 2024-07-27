package string1;

public class CountinString {

	public static void main(String[] args) {
		
		String s="Welcome to selenium and selenium java";//count of e is 6
		
		//find count occurance of e
		
		//find total length of string
		int total_length=s.length();
		
		//System.out.println(total_length);
		
		//find length of string after remove e
		int replace_length=s.replace("e", "").length();
		
		//to find count
		int count=total_length - replace_length;
		
		System.out.println("Count occurance of e is: "+count);
		

	}

}
