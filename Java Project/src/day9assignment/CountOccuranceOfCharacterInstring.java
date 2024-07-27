package day9assignment;

public class CountOccuranceOfCharacterInstring {

	public static void main(String[] args) {

		String s="java programming java opps";

		//to find how many a occurance of a character in whole string
		
		//find total length of string
		int total_length=s.length();//
		//System.out.println(total_length);
		
		//replace a to space and then find length after removing a
		int length_afterremoving=s.replace("a", "").length();
		//System.out.println(length_afterremoving);
		
		int count=total_length - length_afterremoving;
		System.out.println("Occurance of character a is:"+count);//5

	}

}
