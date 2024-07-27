package string1;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
		
		String s="1@string123$%|||()$latinstring";
		
		String st=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(st);

	}

}
