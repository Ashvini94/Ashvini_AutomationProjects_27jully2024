package String;

public class CountCharacterofString {

	public static void main(String[] args) {


		String s="Welcome to java automation and selenium";
		
		//find how many times e is repetaed
		
		int total_length=s.length();//calculate total length
		
		System.out.println(total_length);
		
		//replace e to nothing and find length
		
		s.replace("e", "");
		
		int lengthafterremove= s.replace("e", "").length();
		
		int count=total_length-lengthafterremove;
		
		System.out.println("No of character occurance of e: "+count);

	}

}
