package String;

public class RemoveJunkcharacter {

	public static void main(String[] args) {

		String s="#@%*()123welcome3456lorenspace";
		
		//for remove junck character or special character
		
		String str=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		
		

	}

}
