package String;

public class RemoveWhitespace {

	public static void main(String[] args) {

		String s="welcome   to java  and selenium and    automation";
		
		String str=s.replaceAll("\\s", "");
		
		System.out.println(str);
		

	}

}
