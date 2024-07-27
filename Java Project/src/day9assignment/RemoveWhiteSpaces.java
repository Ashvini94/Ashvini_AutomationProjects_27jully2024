package day9assignment;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {


		String s="java   programming   selenium";
		
		//to remove white spaces in string
		
		String str=s.replaceAll("\\s", "");
		System.out.println(str);

	}

}
