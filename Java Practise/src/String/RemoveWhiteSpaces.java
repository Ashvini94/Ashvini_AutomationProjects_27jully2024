package String;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s="welcome   to java   and selenium";
		
		String st=s.replaceAll("\\s", "");
		System.out.println(st);
		

	}

}
