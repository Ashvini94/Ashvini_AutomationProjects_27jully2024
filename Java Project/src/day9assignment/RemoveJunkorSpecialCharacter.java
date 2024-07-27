package day9assignment;

public class RemoveJunkorSpecialCharacter {

	public static void main(String[] args) {


		//remove junk or special character from string
		String s="@@@@@#$%()??++_&*(( latin string 01234567890";
		
		//use replaceAll()
		String st=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(st);

	}

}
